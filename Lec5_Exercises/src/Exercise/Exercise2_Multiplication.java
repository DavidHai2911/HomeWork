package Exercise;
import java.util.Scanner;
public class Exercise2_Multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen:(2 -9)");
        int n = s.nextInt();
        System.out.println("Bang cuu chuong cua "+n);
        for(int i = 1; i <= 10; i++)
        {
            int a=n*i;
            System.out.println(a);
        }
    }
}
