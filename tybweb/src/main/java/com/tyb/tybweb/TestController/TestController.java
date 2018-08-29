package com.tyb.tybweb.TestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auth: tyb
 * @Date: 18-8-29 上午9:29
 * @Desc:
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "test")
    public String test(Model model) {
        model.addAttribute("test", "测试");
        model.addAttribute("tyb", "陶英镖");
        return "car/index";
    }

}
