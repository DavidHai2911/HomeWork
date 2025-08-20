package Exercises;
import java.util.Scanner;
public class Exercise3 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap nam:");
        int a = s.nextInt();
        if((a%4==0 && a%100!=0)||a%400==0)
        {System.out.println(a+" is a leap year.");}
        else 
        {System.out.println(a+" is not a leap year ");}
    }
}
