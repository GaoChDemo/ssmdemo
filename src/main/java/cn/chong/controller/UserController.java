package cn.chong.controller;


import cn.chong.model.User;
import cn.chong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 跳转到input.jsp
     */
    @RequestMapping("/input")
    public String input(){
        return "input";
    }

    /**
     * 保存
     */
    @RequestMapping("/insertSelective")
    public String insertSelective(User user){
        System.out.println(user);
        userService.insertSelective(user);
        return "succ";
    }
}
