package ss1_java_oop.student_management;

import java.util.Scanner;

public class Student {
    private int id;
    String name;
    double score;


    void Input(){
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();//student: biến đối tượng

        System.out.println("Nhập id: ");
        id=Integer.parseInt(scanner.nextLine());


        System.out.println("Nhập name: ");
        name=scanner.nextLine();

        System.out.println("Nhập score: ");
        score=Double.parseDouble(scanner.nextLine());
    }
    void output(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Score:"+score);
    }
}
