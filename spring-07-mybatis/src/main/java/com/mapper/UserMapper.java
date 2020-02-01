package com.mapper;

import com.pojo.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description User类的接口
 * @Author WangXL
 * @Date 2020/1/31 15:42
 **/
public interface UserMapper {
    /**
     * 查询用户信息
     * @return 用户集合
     */
    public List<User>  selectUser();

    /**
     * 添加用户
     * @param user 用户
     * @return 成功行数
     */
    public int addUser(User user);

    /**
     * 根据id删除用户
     *
     * @param id 用户id
     * @return 成功行数
     */
    public int delete(int id);
}
