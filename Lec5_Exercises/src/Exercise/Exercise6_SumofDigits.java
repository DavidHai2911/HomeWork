package Exercise;
import java.util.Scanner;
public class Exercise6_SumofDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap so nguyen duong:");
        int n = s.nextInt();
        int a = 0;
        for(;n>0;n=n/10)
        {
            int d = n%10;
            a +=d;
        }
        System.out.println("Tong cac so:"+a);
    }
}
