package Weather;

import com.google.gson.annotations.SerializedName;

/**
 * Copyright (C), 2022-09-25
 * FileName: DataDTO
 * Author:   mirai
 * Date:     2022/9/25 14:10
 * Description:
 */
public class DataDTO {
    @SerializedName("Time")
    private String time;
    private String high_temperature;
    private String low_temperature;
    private String wind_direction;
    private String weather;
    private String wind_speed;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHigh_temperature() {
        return high_temperature;
    }

    public void setHigh_temperature(String high_temperature) {
        this.high_temperature = high_temperature;
    }

    public String getLow_temperature() {
        return low_temperature;
    }

    public void setLow_temperature(String low_temperature) {
        this.low_temperature = low_temperature;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }
}
