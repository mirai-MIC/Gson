import com.google.gson.annotations.SerializedName;

public class Students {
    private String school;
    @SerializedName("city")
    private String city;
    private People[] peoples;
    public String getCity() {
        return city;
    }

    public People[] getPeoples() {
        return peoples;
    }
    public String getSchool() {
        return school;
    }
}