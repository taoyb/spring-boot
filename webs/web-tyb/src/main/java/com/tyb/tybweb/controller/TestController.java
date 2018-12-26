package com.tyb.tybweb.controller;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tyb.tybmod.entity.Car;
import com.tyb.tybmod.prize.entity.LotteryRecord;
import com.tyb.tybsvc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @RequestMapping(value = "test")
    public String test(Model model) {

        return "backstage/json";
    }

    @PostMapping("test1")
    public String test1(String json,Model model) {
        JsonParser jsonParser = new JsonParser();
        JsonObject o = (JsonObject) jsonParser.parse(json);
        JsonArray jsonArray = o.get("logs").getAsJsonArray();
        List<LotteryRecord> t = new Gson().fromJson(jsonArray,new TypeToken<List<LotteryRecord>>(){}.getType());
        t.forEach(a-> System.out.println(a.getTransactionAmount()));
        model.addAttribute("secu","成功");
        return "backstage/json";
    }

    @GetMapping("test2")
    public String test2(Model model) {
        model.addAttribute("test", "测试");
        model.addAttribute("tyb", "陶英镖");
        return "backstage/index";
    }
    @GetMapping("test3")
    public String test4(Model model) {
        return "backstage/w_removeSelected";
    }
}
