package com.tyb.tybweb.controller;

import com.tyb.infra.AjaxDone;
import com.tyb.tybmod.dto.LoginDto;
import com.tyb.tybsvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auth: tyb
 * @Date: 18-12-18 上午9:42
 * @Desc:
 */
@Controller
public class LoginController {

    @Autowired
    HttpServletRequest request;
    @Autowired
    private UserService userService;

    @PostMapping(value = "/login", produces = "application/json")
    public @ResponseBody
    AjaxDone login(LoginDto model) {
        try {
            request.getSession().invalidate();
            if (request.getCookies() != null) {
                request.getCookies()[0].setMaxAge(0);
            }
            return userService.findLoginByUserName(model.getUserName());
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxDone.error("未知异常，请看日志");
        }
    }
}
