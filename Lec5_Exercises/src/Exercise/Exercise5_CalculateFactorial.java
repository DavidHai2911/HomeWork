package Exercise;
import java.util.Scanner;
public class Exercise5_CalculateFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so nguyen khong am :");
        int n = s.nextInt();
        int g = 1;
        for(int i = 1; i<=n;i++)
        {
             g *=i;
        }
        System.out.println("Giai thua cua "+n+"! = "+g);
    }
}
