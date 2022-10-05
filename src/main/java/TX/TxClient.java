package TX;

import com.google.gson.Gson;
import utils.SendGet;

/**
 * Copyright (C), 2022-09-26
 * FileName: TxClient
 * Author:   mirai
 * Date:     2022/9/26 21:02
 * Description:
 */
public class TxClient {
    public static void main(String[] args) {
        Gson gson = new Gson();
        TxData txData = gson.fromJson(new SendGet().SendGET("https://xiaoapi.cn/API/dy_tx.php?msg=%E5%BA%86%E4%BD%99%E5%B9%B4&n=1&num=1", ""), TxData.class);
        System.out.println(txData.getPic());
        System.out.println(txData.getTitle());
        System.out.println(txData.getMsg());
        System.out.println(txData.getPlay_title());
        System.out.println(txData.getUrl());
    }
}
