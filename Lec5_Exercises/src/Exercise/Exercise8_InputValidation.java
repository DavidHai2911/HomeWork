package Exercise;
import java.util.Scanner;
public class Exercise8_InputValidation {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Nhap 1 so tu (1 - 10):");
            n = s.nextInt();
            if (1>n || n>10)
            {
                System.out.println("Nhap sai yeu cau nhap lai");
            }
        }
        while(1>n || n>10);
        System.out.println(n);
    }
}
