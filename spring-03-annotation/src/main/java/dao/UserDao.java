package dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Description
 * @Author WangXL
 * @Date 2020/1/30 19:23
 **/
@Repository
public class UserDao {
    @Value("dao")
    private String dao;
}
