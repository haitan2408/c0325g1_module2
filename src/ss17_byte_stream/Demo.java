package ss17_byte_stream;


import mvc.entity.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

    public static void main(String[] args) {
//        Student s1 = new Student(1, "John Doe", "QN", 9, "C0325G1");
//
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))){
//            oos.writeObject(s1);
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Khong tim thay file");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("Loi ghi du lieu");
//        }


        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {
            Student o = (Student)ois.readObject();
            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("loi doc du lieu");
        } catch (ClassNotFoundException e) {
            System.out.println("Looix khong tim thay class");
        }

    }
}
