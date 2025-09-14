package Code;

import java.util.*;
import java.text.*;

public class Teacher extends Person {

    private String Id_teacher;
    private String Rating;

    public Teacher(String Id_teacher, String Rating) {
        this.Id_teacher = Id_teacher;
        this.Rating = Rating;
    }

    public Teacher() {
    }

    public String getIdteacher() {
        return Id_teacher;
    }

    public void setIdteacher(String Id_teacher) {
        this.Id_teacher = Id_teacher;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id teacher:");
        setIdteacher(sc.nextLine());
        Chose_rating();
    }

    public void Chose_rating() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu rating:");
        System.out.println("1 - A");
        System.out.println("2 - B");
        System.out.println("3 - C");
        int choose = sc.nextInt();
        System.out.println("Your rating:");
        switch (choose) {
            case 1:
                System.out.println("1 - A");
                setRating("A");
                break;
            case 2:
                System.out.println("2 - B");
                setRating("B");
                break;
            case 3:
                System.out.println("3 - C");
                setRating("C");
                break;
            default:
                System.out.println("Error");
        }
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Id teacher :" + getIdteacher());
        System.out.println("Rating :" + getRating());
    }
}