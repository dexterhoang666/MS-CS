import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//class MyExample2{
//    public static void method1() {
//        File file = new File("exp.txt");
//        FileReader reader =new FileReader(file)
//
//    }
//}
class Student{
    private int roll;
    private String name;
}

class Department{
    private int code;
    private String name;
}


public class MyException {

    public static void main(String[] args) {

        try {
            Department dept = new Department();
            Student stud = new Student();
            List<Student> list = new ArrayList<>();


            list.add(stud);

            Student student = (Student) list.get(0);
        }catch (ClassCastException){
            System.out.println("You are written bad code");
        }finally{
            System.out.println("");
        }



    }


}
