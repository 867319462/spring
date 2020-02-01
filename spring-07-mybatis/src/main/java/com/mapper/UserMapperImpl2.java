package com.mapper;

import com.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @ClassName UserMapperImpl2
 * @Description
 * @Author WangXL
 * @Date 2020/1/31 20:03
 **/
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        addUser(new User(9,"Tom",10,"Chinese"));
        delete(3);
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int delete(int id) {
        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }
}
