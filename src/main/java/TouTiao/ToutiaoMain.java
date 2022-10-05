package TouTiao;


import com.google.gson.Gson;
import utils.SendGet;

/**
 * Copyright (C), 2022-09-24
 * FileName: ToutiaoMain
 * Author:   mirai
 * Date:     2022/9/24 17:33
 * Description:
 */
public class ToutiaoMain {
    public static void main(String[] args) {
        String s = new SendGet().SendGET("https://yuanxiapi.cn/api/JinRiHotsearch/", "");
        Gson gson = new Gson();
        Data_T data_t = gson.fromJson(s, Data_T.class);
        System.out.println("时间: "+data_t.getTime());
        for (Data_T.DataDTO datum : data_t.getData()) {
            System.out.println("查询词: "+datum.getQueryWord());
            System.out.println("标题: "+datum.getTitle());
            System.out.println("链接: "+datum.getLink());
            System.out.println("热度: "+datum.getHeat()+"\n");
        }
    }
}
