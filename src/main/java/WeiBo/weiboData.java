package WeiBo;

import java.util.List;

/**
 * Copyright (C), 2022-09-24
 * FileName: weiboData
 * Author:   mirai
 * Date:     2022/9/24 17:42
 * Description:
 */
public class weiboData {

    private boolean success;
    private String title;
    private String subtitle;
    private String update_time;
    private List<DataDTO> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        private int index;
        private String title;
        private String hot;
        private String url;
        private String mobilUrl;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getHot() {
            return hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMobilUrl() {
            return mobilUrl;
        }

        public void setMobilUrl(String mobilUrl) {
            this.mobilUrl = mobilUrl;
        }
    }
}
