package com.mapper;

import com.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author WangXL
 * @Date 2020/1/31 19:27
 **/
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        return sqlSessionTemplate.getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
