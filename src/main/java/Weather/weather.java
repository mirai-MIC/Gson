package Weather;

import com.google.gson.Gson;
import utils.SendGet;

import java.util.Scanner;

/**
 * Copyright (C), 2022-09-25
 * FileName: weather
 * Author:   mirai
 * Date:     2022/9/25 14:08
 * Description:
 */
public class weather {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);
        String s = new SendGet().SendGET("https://ovooa.com/API/santq/api.php?msg=", scanner.next());
        Data_We data_we = gson.fromJson(s, Data_We.class);
        System.out.println("城市: "+data_we.getData().getCity());
        data_we.getData().getData().forEach(WT->{
            System.out.println("时间: "+WT.getTime());
            System.out.println("最高温度: "+WT.getHigh_temperature());
            System.out.println("最低气温: "+WT.getLow_temperature());
            System.out.println("风向: "+WT.getWind_direction());
            System.out.println("天气: "+WT.getWeather());
            System.out.println("风力: "+WT.getWind_speed()+"\n");
        });
        System.out.println(data_we.getData().getTips());

    }
}
