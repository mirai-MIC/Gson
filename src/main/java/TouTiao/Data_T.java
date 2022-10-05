package TouTiao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Copyright (C), 2022-09-24
 * FileName: Data_T
 * Author:   mirai
 * Date:     2022/9/24 17:32
 * Description:
 */
public class Data_T {

    private String code;
    private String msg;
    private String time;
    private List<DataDTO> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        private String title;
        private String heat;
        @SerializedName("QueryWord")
        private String queryWord;
        private String link;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getHeat() {
            return heat;
        }

        public void setHeat(String heat) {
            this.heat = heat;
        }

        public String getQueryWord() {
            return queryWord;
        }

        public void setQueryWord(String queryWord) {
            this.queryWord = queryWord;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }
    }
}
