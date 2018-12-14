package com.tyb.tybweb.controller;

import com.tyb.tybmod.entity.Car;
import com.tyb.tybsvc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auth: tyb
 * @Date: 18-8-29 上午9:29
 * @Desc:
 */
@Controller
@RequestMapping("test")
public class TestController {


    @Autowired
    private CarService carService;

    @RequestMapping(value = "test")
    public String test(Model model) {

        return "car/index";
    }

    @GetMapping("test1")
    public String test1(Model model) {
        List<Car> list = carService.findAll();
        model.addAttribute("test", "测试");
        model.addAttribute("tyb", "陶英镖");
        return "car/index";
    }
}
