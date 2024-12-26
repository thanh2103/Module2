package ss1_java_oop.student_management;

import java.util.ArrayList;
import java.util.Scanner;
//nhập và xuất thông tin của n học sinh
public class StudentManagement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số lượng sinh viên muốn nhập: ");
//        int n=scanner.nextInt();
//        ArrayList<Student> students = new ArrayList<>();
//        Student student;
//
//        for (int i = 0; i <= n; i++) {
//            System.out.println("Nhập thông tin sinh viên thứ "+i);
//            student = new Student();
//            student.Input();
//            students.add(student);
//        }
//
//        for(int i=1; i<=n; i++) {
//            System.out.println("Thông tin sinh viên thứ "+i);
//            students.get(i-1).Input();
//        }

        Student2 student = new Student2();
        student.Input();

        //Student2 student2 = new Student2(1,"thanh",3.4);
        //student2.output();

    }
}
