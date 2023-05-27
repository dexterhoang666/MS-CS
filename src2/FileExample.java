import java.io.File;
import java.io.IOException;

public class FileExample {


    public static void createFile() {
        try {
            File file = new File("exp.txt");
            file.createNewFile();
        }catch(IOException e){
            System.out.println("Invalid file path");
        }
    }
//    public void divide(float num1, float num2) {
//        float result = 0;
//        result = num1 / num2;
//        System.out.println("division is: " + result);
//    }
public static void main(String[] args) {
    FileExample fileEx = new FileExample();
    fileEx.createFile();
}


}
