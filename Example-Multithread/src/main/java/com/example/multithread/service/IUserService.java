package com.example.multithread.service;

import com.example.multithread.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DiiD
 */
@Service
public interface IUserService {

    /**
     * 根据条件分页查询用户列表
     *
     * @return 用户信息集合信息
     */
    public List<User> selectUserList();

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    public User selectUserByLoginName(String userName);

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
    public User selectUserById(Long userId);

    /**
     * 通过用户ID删除用户
     *
     * @param userId 用户ID
     * @return 结果
     */
    public int deleteUserById(Long userId);

    /**
     * 批量删除用户信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserByIds(String ids);

    /**
     * 修改用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 批量新增用户
     *
     * @param userList 新增用户列表
     * @return 结果
     */
    public int batchInsertUser(List<User> userList) throws InterruptedException;
}
