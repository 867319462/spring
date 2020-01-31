package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description
 * @Author WangXL
 * @Date 2020/1/30 19:23
 **/
@Service
public class UserService {
    @Value("service")
    private String service;
}
