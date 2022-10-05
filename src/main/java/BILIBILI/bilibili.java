package BILIBILI;

import com.google.gson.Gson;
import utils.SendGet;

/**
 * Copyright (C), 2022-09-24
 * FileName: bilibili
 * Author:   mirai
 * Date:     2022/9/24 16:51
 * Description:
 */
public class bilibili {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String s = new SendGet().SendGET("https://ovooa.com/API/B_Update_Days/?num=10", "");
        bili_var bi_gson = gson.fromJson(s, bili_var.class);
        StringBuilder list = new StringBuilder();
        for (bili_var.DataDTO datum : bi_gson.getData()) {
            list.append("名字: "+datum.getName()+"\n");
            list.append("封面: "+datum.getPicture()+"\n");
            list.append("更新: "+datum.getUpdate()+"\n");
            list.append("时间: "+datum.getTime()+"\n");
            list.append("链接: "+datum.getUrl()+"\n\n");
        }
        System.out.println(list);
    }
}
