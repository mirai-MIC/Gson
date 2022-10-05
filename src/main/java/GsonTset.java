import com.google.gson.Gson;

public class GsonTset {
    public static void main(String[] args) {
        String jsonSpecialStr = "{\"school\":\"NanJingDaXue\",\"city\":\"najing\",\"peoples\":[{\"name\":\"zhangsan\",\"age\":\"18\"},{\"name\":\"zhangsan\",\"age\":\"18\"}]}";
        Gson gson = new Gson();
        Students students = gson.fromJson(jsonSpecialStr, Students.class);
        System.out.println("学校: "+students.getSchool());
        System.out.println("城市: "+students.getCity()+"\n");
        for (People people : students.getPeoples()) {
            System.out.println("名字: "+people.getName());
            System.out.println("年龄: "+people.getAge()+"\n");
        }
    }
}