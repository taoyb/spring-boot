package com.tyb.tybweb.controller;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tyb.tybmod.prize.dao.LotteryRecordDao;
import com.tyb.tybmod.prize.entity.LotteryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auth: tyb
 * @Date: 18-12-24 上午11:57
 * @Desc:
 */
@Controller
@RequestMapping("prize")
public class PrizeController {
    @Autowired LotteryRecordDao lotteryRecordDao;

    @GetMapping("playerList")
    public String playerList() {
        return "backstage/prize/player";
    }

    @GetMapping("savePlayer")
    public String savePlayer() {
        return "backstage/prize/player";
    }

    @GetMapping("lotteryRecordList")
    public String lotteryRecordList() {
//        lotteryRecordDao.findAll(new Sort(Sort.Direction.DESC,"logId"));
        return "backstage/prize/lotteryRecordList";
    }

    @GetMapping("lotteryRecordToSave")
    public String lotteryRecordToSave() {
        return "backstage/prize/lotteryRecordSave";
    }

    @PostMapping("lotteryRecordSave")
    public String lotteryRecordSave(String json) {
        JsonParser jsonParser = new JsonParser();
        JsonObject o = (JsonObject) jsonParser.parse(json);
        JsonArray jsonArray = o.get("data").getAsJsonArray();

        List<LotteryRecord> t = new Gson().fromJson(jsonArray, new TypeToken<List<LotteryRecord>>() {
        }.getType());
        LotteryRecord first  = lotteryRecordDao.findFirstByOrderByCreateTimeDesc();
        if (first != null){
            t.stream().filter(t1 -> t1.getCreateTime().getTime() > first.getCreateTime().getTime()).forEach(
                    t1 -> {
                        lotteryRecordDao.save(t1);
                    }
            );
        }else{
            t.forEach(
                    t1 -> {
                        lotteryRecordDao.save(t1);
                    }
            );
        }
        return "backstage/prize/lotteryRecordList";
    }

}
