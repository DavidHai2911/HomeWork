package Exercise;
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so nguyen :");
        int a = s.nextInt();
        s.nextLine();
        System.out.println("Nhap chu :");
        String b = s.nextLine();
        System.out.println(a);
        System.out.println(b);
    }
}
