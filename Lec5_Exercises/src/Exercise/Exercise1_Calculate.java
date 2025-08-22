package Exercise;
import java.util.Scanner;
public class Exercise1_Calculate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so duong:");
        int n = s.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++)
        {
            sum =sum +i;
        }
        System.out.println(sum);
    }
}
