package RedPower;

import com.google.gson.Gson;
import utils.SendGet;

/**
 * Copyright (C), 2022-09-24
 * FileName: DouYinRed
 * Author:   mirai
 * Date:     2022/9/24 17:11
 * Description:
 */
public class BiliRed {
    public static void main(String[] args) {
        String s = new SendGet().SendGET("http://api.duozy.cn/api/bilibilirs.php", "");
        Gson gson = new Gson();
        Data data = gson.fromJson(s, Data.class);
        int count = 1;
        System.out.println("时间: "+data.getTime());
        for (Data.DataDTO datum : data.getData()) {
            System.out.println(count+"\t:\t"+datum.getTitle());
            System.out.println("\t\t"+datum.getLink());
            System.out.println("\t\t热度: "+datum.getHeat());
            count++;
        }
    }
}
