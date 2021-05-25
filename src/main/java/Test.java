import java.io.File;
import java.io.FileInputStream;

public class Test {
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args){
        System.out.println("hello world");
        Test h=new Test();
        h.getIM();
    }

    public String getIM(){
        try {
            File f=new File("d:/ee.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        return "";
    }
}
