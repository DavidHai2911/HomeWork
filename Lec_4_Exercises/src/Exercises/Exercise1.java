package Exercises;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen");
        int a = s.nextInt();
        if (a%2==0)
        {System.out.println("So "+a+" la so chan.");}
        else
        {System.out.println("So "+a+" la so le.");}
    }
}
