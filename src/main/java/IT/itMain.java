package IT;

import com.google.gson.Gson;
import utils.SendGet;

/**
 * Copyright (C), 2022-09-24
 * FileName: itMain
 * Author:   mirai
 * Date:     2022/9/24 17:50
 * Description:
 */
public class itMain {
    public StringBuilder ITMain(){
        String s = new SendGet().SendGET("https://api.vvhan.com/api/hotlist?type=itInfo", "");
        Gson gson = new Gson();
        StringBuilder it = new StringBuilder();
        itData itData = gson.fromJson(s, itData.class);
        itData.getData().forEach(itDataIO->{
            it.append("index: "+itDataIO.getIndex()+"\n");
            it.append(itDataIO.getTitle()+"\n");
            it.append(itDataIO.getUrl()+"\n");
        });
        return it;
    }

    public static void main(String[] args) {
        System.out.println(new itMain().ITMain());
    }
}
