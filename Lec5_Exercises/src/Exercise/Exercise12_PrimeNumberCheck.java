package Exercise;
import java.util.Scanner;
public class Exercise12_PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Nhap so nguyen > 1:");
        int a = s.nextInt();
        boolean p = true;
        for(int i = 2; i<=Math.sqrt(a);i++){
                if (a%i==0)
            {
                p = false;
                break;
            }
        }
        if (p)
        {
           System.out.println(a + " la so nguyen to");
        }
        else 
        {
            System.out.println(a + " ko la so nguyen to");
        }
    }
}
