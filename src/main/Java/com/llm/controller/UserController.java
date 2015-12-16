package com.llm.controller;



import com.google.gson.Gson;
import com.llm.entity.User;
import com.llm.server.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;



/**
 * Created by liuliming on 15/12/9.
 */
@Controller
@RequestMapping("/webapp")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户登录
     * @param request
     * @return
     */
    @RequestMapping("/index")
    public String loginuser(HttpServletRequest request){
       String username=request.getParameter("username");
       String password=request.getParameter("password");
       String email=request.getParameter("email");
       User users=this.userService.loginUser(username, password, email);
        Gson gson=new Gson();
        String json=gson.toJson(users);
        System.out.print(json.length());
        return json;
    }

    /**
     * 用户注册
     * @param request
     * @return
     */
    public  Boolean insertUser(HttpServletRequest request){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        char status=1;
        /*SimpleDateFormat sin=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        String time=sin.format(new java.util.Date());
        Date date=Date.valueOf(time);*/
        User users=new User();
        users.setEmail(email);
        users.setStatus(status);
        users.setUsername(username);
        boolean  bool=this.userService.insertUser(users);
        return bool;

    }

    /**
     * 找回密码
     * @param request
     * @return
     */
    public String findPassword(HttpServletRequest request){
        String username=request.getParameter("username");
        String email=request.getParameter("email");
        String password=this.userService.findPassword(username,email);
        if (password==null){
            request.setAttribute("erro","");
        }
        return password;
    }
}
