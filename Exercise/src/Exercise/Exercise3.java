package Exercise;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen:");
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a+b;
        System.out.println("Tong 2 so nguyen: "+sum);
    }
}
