package FY;

import com.google.gson.Gson;
import utils.SendGet;

import java.util.Scanner;

/**
 * Copyright (C), 2022-10-01
 * FileName: fuMain
 * Author:   mirai
 * Date:     2022/10/1 16:34
 * Description:
 */
public class fuMain{
    public static void main(String[] args) {
        /*
        <option value="AUTO"> 自动检测 </option>
        <option value = "ZH_CN2EN" > 中译英 < /option>
        <option value = "ZH_CN2JA" > 中译日 < /option>
        <option value = "ZH_CN2KR" > 中译韩 < /option>
        <option value = "ZH_CN2FR" > 中译法 < /option>
        <option value = "ZH_CN2RU" > 中译俄 < /option>
        <option value = "ZH_CN2SP" > 中译西 < /option>
        <option value = "EN2ZH_CN" > 英译中 < /option>
        <option value = "JA2ZH_CN" > 日译中 < /option>
        <option value = "KR2ZH_CN" > 韩译中 < /option>
        <option value = "FR2ZH_CN" > 法译中 < /option>
        <option value = "RU2ZH_CN" > 俄译中 < /option>
        <option value = "SP2ZH_CN" > 西译中 < /option>
        */
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        String s = new SendGet().SendGET("http://fanyi.youdao.com/translate?&doctype=json&type=ZH_CN2EN&i=",next);
        Gson gson = new Gson();
        FyData fyData = gson.fromJson(s, FyData.class);
        fyData.getTranslateResult().forEach(ss->{
            ss.forEach(rf ->{
                System.out.println("原文: "+rf.getSrc());
                System.out.println("翻译: "+rf.getTgt());
            });
        });
    }
}
