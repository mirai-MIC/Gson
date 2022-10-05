package Weather;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Copyright (C), 2022-09-25
 * FileName: DataDTOX
 * Author:   mirai
 * Date:     2022/9/25 14:10
 * Description:
 */
public class DataDTOX {
    private String city;
    private List<DataDTO> data;
    @SerializedName("Tips")
    private String tips;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
