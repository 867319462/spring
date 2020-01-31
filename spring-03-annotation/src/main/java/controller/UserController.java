package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @ClassName UserController
 * @Description
 * @Author WangXL
 * @Date 2020/1/30 19:21
 **/
@Controller
public class UserController {
    @Value("controller")
    private String controller;
}
