package Wy;

import com.google.gson.Gson;
import utils.SendGet;

import java.util.Scanner;

/**
 * Copyright (C), 2022-09-24
 * FileName: wyMain
 * Author:   mirai
 * Date:     2022/9/24 11:55
 * Description:
 */
public class wyMain {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String s = new SendGet().SendGET("https://ovooa.com/API/kwdg/api.php?msg="+next+"&n=1&type=json&h=%E6%8D%A2%E8%A1%8C&sc=1","").substring(5);
        WYData wyData = gson.fromJson(s, WYData.class);
        System.out.println(wyData.getMeta().getMusic().getPreview());
        System.out.println(wyData.getMeta().getMusic().getTitle());
        System.out.println(wyData.getMeta().getMusic().getMusicUrl());

    }
}
