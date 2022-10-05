import com.google.gson.Gson;
import utils.SendGet;

/**
 * Copyright (C), 2022-09-24
 * FileName: AiMain
 * Author:   mirai
 * Date:     2022/9/24 0:09
 * Description:
 */
public class AiMain {
    public static void main(String[] args) {
        String s = new SendGet().SendGET("https://ovooa.com/API/chouq/api.php", "");
        Gson gson = new Gson();
        Lod lod = gson.fromJson(s, Lod.class);
        System.out.println(lod.getData().getFormat());
        System.out.println(lod.getData().getDraw());
        System.out.println(lod.getData().getAnnotate());
        System.out.println(lod.getData().getExplain());
        System.out.println(lod.getData().getDetails());
        System.out.println(lod.getData().getSource());
        System.out.println(lod.getData().getImage());
        System.out.println("end");
    }
}
