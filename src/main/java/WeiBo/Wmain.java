package WeiBo;

import com.google.gson.Gson;
import utils.SendGet;

/**
 * Copyright (C), 2022-09-24
 * FileName: Wmain
 * Author:   mirai
 * Date:     2022/9/24 17:42
 * Description:
 */
public class Wmain {
    public static void main(String[] args) {
        String s = new SendGet().SendGET("https://api.vvhan.com/api/hotlist?type=wbHot", "");
        Gson gson = new Gson();
        weiboData weiboData = gson.fromJson(s, WeiBo.weiboData.class);
        int status=1;
        for (WeiBo.weiboData.DataDTO datum : weiboData.getData()) {
            System.out.println("热度: "+datum.getHot());
            System.out.println("标题: "+status+"\t:\t"+datum.getTitle());
            System.out.println("链接: "+datum.getUrl());

        }
    }
}
