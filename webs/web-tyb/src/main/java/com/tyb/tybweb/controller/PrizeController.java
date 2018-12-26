package com.tyb.tybweb.controller;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tyb.tybmod.prize.dao.LotteryRecordDao;
import com.tyb.tybmod.prize.entity.LotteryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        return "backstage/prize/player";
    }

    @GetMapping("lotteryRecordSave")
    public String lotteryRecordSave(String json) {
        /*String json =  "{" +
                "    \"header\":{" +
                "        \"token\":\"\"," +
                "        \"uid\":\"\"," +
                "        \"version\":\"2\"," +
                "        \"time\":\"2018-12-11 16:14:40:713\"" +
                "    }," +
                "    \"code\":10000," +
                "    \"message\":\"成功\"," +
                "    \"logs\":[" +
                "        {" +
                "            \"logId\":0," +
                "            \"transactionAmount\":\"5.00\"," +
                "            \"optType\":15," +
                "            \"message\":\"me\"," +
                "            \"userId\":\"2018050412392376226000659\"," +
                "            \"createDate\":\"2018-12-10 21:14:55\"," +
                "            \"accountOrderId\":\"201812102114555199050679\"," +
                "            \"tradeCode\":\"_\"," +
                "            \"tradeMessage\":\"aa\"," +
                "            \"schameType\":\"0\"," +
                "            \"showDate\":\"1\"," +
                "            \"walletType\":1," +
                "            \"balanceBefore\":0," +
                "            \"balanceAfter\":0," +
                "            \"balanceEnvelope\":0," +
                "            \"balancePrize\":0," +
                "            \"balanceRecharge\":0," +
                "            \"balancePoint\":33032," +
                "            \"balance\":0" +
                "        }," +
                "        {" +
                "            \"logId\":0," +
                "            \"transactionAmount\":\"1980.00\"," +
                "            \"optType\":2," +
                "            \"message\":\"mess\"," +
                "            \"userId\":\"2018050412392376226000659\"," +
                "            \"createDate\":\"2018-12-09 17:48:45\"," +
                "            \"accountOrderId\":\"201812091748384669014639\"," +
                "            \"tradeCode\":\"2018120917483847231722797\"," +
                "            \"tradeMessage\":\"aa\"," +
                "            \"schameType\":\"5\"," +
                "            \"showDate\":\"1\"," +
                "            \"walletType\":5," +
                "            \"balanceBefore\":0," +
                "            \"balanceAfter\":0," +
                "            \"balanceEnvelope\":0," +
                "            \"balancePrize\":0," +
                "            \"balanceRecharge\":0," +
                "            \"balancePoint\":null," +
                "            \"balance\":0" +
                "        }" +
                "    ]," +
                "    \"isEnd\":false" +
                "}";*/
        JsonParser jsonParser = new JsonParser();
        JsonObject o = (JsonObject) jsonParser.parse(json);
        JsonArray jsonArray = o.get("logs").getAsJsonArray();
        List<LotteryRecord> t = new Gson().fromJson(jsonArray, new TypeToken<List<LotteryRecord>>() {
        }.getType());
        for (int i = 0; i < jsonArray.size(); i++) {
            LotteryRecord t1 = new Gson().fromJson(jsonArray.get(i).getAsJsonObject(), LotteryRecord.class);
            JsonObject sub = jsonArray.get(i).getAsJsonObject();
            System.out.println(sub.get("transactionAmount"));
        }
        return "backstage/prize/player";
    }

}
