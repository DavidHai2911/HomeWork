package Exercises;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap do tuoi:");
        int a = s.nextInt();
        if(a>=60)
        {System.out.println("Senior");}
        else if(a<=59 && a>=20)
        {System.out.println("Adult");}
        else if(a<=19 && a>=13)
        {System.out.println("Teenager");}
        else if(a<=12)
        {System.out.println("Child");}
    }
}
