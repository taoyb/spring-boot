package com.tyb.tybweb.controller;

import com.google.common.collect.Lists;
import com.tyb.tybsvc.dao.CarDao;
import com.tyb.tybsvc.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    private CarDao carDao;

    @RequestMapping(value = "test")
    public String test(Model model) {
        List<Car> list = carDao.findAll();
        model.addAttribute("test", "测试");
        model.addAttribute("tyb", "陶英镖");
        return "car/index";
    }
}
