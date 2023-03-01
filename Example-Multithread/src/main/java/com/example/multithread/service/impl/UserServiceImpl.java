package com.example.multithread.service.impl;

import com.example.multithread.domain.User;
import com.example.multithread.mapper.UserMapper;
import com.example.multithread.service.IUserService;
import com.example.multithread.util.Convert;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author DiiD
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserByLoginName(String userName) {
        return userMapper.selectUserByLoginName(userName);
    }

    @Override
    public User selectUserById(Long userId) {
        return userMapper.selectUserById(userId);
    }

    @Override
    public int deleteUserById(Long userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int deleteUserByIds(String ids) {
        Long[] userIds = Convert.toLongArray(ids);
        return userMapper.deleteUserByIds(userIds);
    }

    @Override
    public int updateUser(User user) {
        User oldUser = userMapper.selectUserByLoginName(user.getUserName());
        user.setUserId(oldUser.getUserId());
        // 多线程一起访问，数据乱序
        user.setAge(oldUser.getAge() + 1);
        System.out.println(user.toString());
        return userMapper.updateUser(user);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int batchInsertUser(List<User> userList) throws InterruptedException {
        // todo 一次性插入一万条数据平均耗时650ms
        // return userMapper.batchInsertUser(userList);

//        if(userList.size() > 200) {
//            List<List<User>> smallUserList = Lists.partition(userList, 200);
//            int count = 0;
//            for(int i = 0; i < smallUserList.size(); i++) {
//                count += userMapper.batchInsertUser(smallUserList.get(i));
//            }
//            return count;
//        }
        if (userList.size() > 200) {
            List<List<User>> smallUserList = Lists.partition(userList, 200);
            ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 10, 0, TimeUnit.MILLISECONDS, new SynchronousQueue<>(), new ThreadPoolExecutor.CallerRunsPolicy());
            CountDownLatch countDownLatch = new CountDownLatch(smallUserList.size());
            // 须和CountDownLatch的数量保持一致，否则显示不准确
            LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue(smallUserList.size());
            int result = 0;
            for (int i = 0; i < smallUserList.size(); i++) {
                List<User> part = smallUserList.get(i);
                executor.execute(() -> {
                    int cnt = userMapper.batchInsertUser(part);
                    // 不可使用add方法，否则出现Queue full 错误
                    queue.offer(cnt);
                    countDownLatch.countDown();
                });
            }
            countDownLatch.await();
            for (Integer cnt : queue) {
                result += cnt;
            }
            return result;
        }
        return userMapper.batchInsertUser(userList);
    }

    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }
}
