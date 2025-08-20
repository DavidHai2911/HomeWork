package Exercises;
import java.util.Scanner;
public class Exercise9 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 1 so:"); 
        int a = s.nextInt();
        int abs = (a >= 0) ? a : -a;
        System.out.println("Tri tuyet doi:"+abs); 
    }
}