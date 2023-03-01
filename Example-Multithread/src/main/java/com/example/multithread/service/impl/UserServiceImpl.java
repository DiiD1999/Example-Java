package com.example.multithread.service.impl;

import com.example.multithread.domain.User;
import com.example.multithread.mapper.UserMapper;
import com.example.multithread.service.IUserService;
import com.example.multithread.util.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public int batchInsertUser(List<User> userList) {
        return userMapper.batchInsertUser(userList);
    }

    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }
}
