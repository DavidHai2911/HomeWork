package Exercises;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap diem(0-10):"); 
        double p = s.nextDouble();
        if (p>=9.0)
        {System.out.println("Excellent");}
        else if(p>=8.0 && p<=8.9)
        {System.out.println("Good");}
        else if(p>=6.5 && p<=7.9)
        {System.out.println("Fair");}
        else if(p>=5.0 && p<=6.4)
        {System.out.println("Average");}
        else if(p<5.0)
        {System.out.println("Fail");}
    }
}
