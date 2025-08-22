package Exercise;
import java.util.Scanner;
public class Exercise9_CalculateAverageUntil0isEntered {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int a = 0;    
        int b = 0;    
        System.out.print("Nhap 1 so(0 de dung): ");
        n = s.nextInt();
        while (n != 0) {
            a += n;
            b++;
            System.out.print("Nhap 1 so(0 de dung): ");
            n = s.nextInt();
        }
            double ave = (double) a / b;
            System.out.println("Trung binh cong: " + ave);
    }
}
