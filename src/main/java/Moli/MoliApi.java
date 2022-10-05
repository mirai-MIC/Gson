package Moli;

import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C), 2022-09-25
 * FileName: MoliApi
 * Author:   mirai
 * Date:     2022/9/25 18:36
 * Description:
 */
public class MoliApi {
    public static void main(String[] args) {
        String mollyUrl = "https://i.mly.app/reply";
        Map<String, String> params = new HashMap<>();
//        xk0sug8ccwqpp27z
//        0w3ne9b7

        params.put("Api-Key","xk0sug8ccwqpp27z");
        params.put("Api-Secret","0w3ne9b7");
        //我们请求的字符串
        params.put("type","1");
        params.put("from","3092179918");
        params.put("fromName","null");
        params.put("to","1111111111");
        params.put("toName","测试");
        System.out.println(params);
    }
}
