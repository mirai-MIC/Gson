package BILIBILI;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Copyright (C), 2022-09-24
 * FileName: bili_var
 * Author:   mirai
 * Date:     2022/9/24 16:51
 * Description:
 */
public class bili_var {

    private int code;
    private String text;
    private List<DataDTO> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        @SerializedName("Name")
        private String name;
        @SerializedName("Picture")
        private String picture;
        @SerializedName("Update")
        private String update;
        @SerializedName("Time")
        private String time;
        @SerializedName("Url")
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getUpdate() {
            return update;
        }

        public void setUpdate(String update) {
            this.update = update;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
