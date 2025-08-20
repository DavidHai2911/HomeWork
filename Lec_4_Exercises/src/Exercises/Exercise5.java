package Exercises;
import java.util.Scanner;
public class Exercise5 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ngay (1-7):");
        int a = s.nextInt();
            switch (a) {
                case 1 : System.out.println("Mon");break;
                case 2 : System.out.println("Tue");break;
                case 3 : System.out.println("Wen");break;
                case 4 : System.out.println("Thu");break;
                case 5 : System.out.println("Fri");break;
                case 6 : System.out.println("Sat");break;
                case 7 : System.out.println("Sun");break;
                default:System.out.println("Sai ngay.");break;
            }
    }
}
