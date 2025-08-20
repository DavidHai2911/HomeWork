package Exercises;
import java.util.Scanner;
public class Exercise7 {
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 3 so nguyen :"); 
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int l;
        if (a > b) {
            if (a > c) {
                l = a;
            } else {
                l = c;
            }
        } else {
            if (b > c) {
                l = b;
            } else {
                l = c;
            }
        }
           System.out.println("So lon nhat la "+l);
    }
}
