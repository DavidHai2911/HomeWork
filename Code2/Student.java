package Code;

import java.util.*;
import java.text.*;

public class Student extends Person {

    private String Id_student;
    private String Training;

    public Student(String Id_student, String Training) {
        this.Id_student = Id_student;
        this.Training = Training;
    }

    public Student() {
    }

    public String getid() {
        return Id_student;
    }

    public void setid(String Id_student) {
        this.Id_student = Id_student;
    }

    public String gettraining() {
        return Training;
    }

    public void settraining(String Training) {
        this.Training = Training;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id:");
        setid(sc.nextLine());
        Training_rating();
    }

    public void Training_rating() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose your rating:");
        System.out.println("Chose 1 - Good");
        System.out.println("Chose 2 - Rather");
        System.out.println("Chose 3 - Medium");
        System.out.println("Chose 4 - Weak");
        int choose = sc.nextInt();
        System.out.println("Your chose");
        switch (choose) {
            case 1:
                System.out.println("1 - Good.");
                settraining("Good");
                break;
            case 2:
                System.out.println("2 - Rather.");
                settraining("Rather");
                break;
            case 3:
                System.out.println("3 - Medium.");
                settraining("Medium");
                break;
            case 4:
                System.out.println("4 - Weak.");
                settraining("Weak");
                break;
            default:
                System.out.println("Error");
        }
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Id student :" + getid());
        System.out.println("Your training rating :" + gettraining());
    }
}