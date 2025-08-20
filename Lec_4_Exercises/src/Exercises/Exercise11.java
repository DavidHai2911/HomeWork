package Exercises;
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap 3 so de tinh (ax^2+bx+c=0):");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a==0)
        {
            double x=-c/b;
            System.out.println("Phuong trinh bang: "+x);
        }
        else if(a!=0)
        {
            double d=Math.pow(b, 2)-4*a*c;
            if(d<0)
            {
                System.out.println("Phuong trinh khong co nghiem thuc.");
            }
            else if(d==0)
            {
                System.out.println("Phuong trinh co nghiem kep.");
                System.out.println("x1 = x2 = "+(-b/(2*a)));
            }
            else
            {
                double can = Math.sqrt(d);
                System.out.println("Phuong trinh co 2 nghiem:");
                System.out.println("x1 = "+((-b+can)/(2*a)));
                System.out.println("x2 = "+((-b-can)/(2*a)));
            }
        }
    }
}
