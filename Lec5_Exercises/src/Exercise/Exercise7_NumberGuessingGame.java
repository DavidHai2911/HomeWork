 package Exercise;
import java.util.Random;
import java.util.Scanner;
public class Exercise7_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r =new Random();
        int ram, n;
        ram = r.nextInt(100)+1;
        do
        {
            System.out.println("Nhap so ban muon:");
            n = s.nextInt();
            if(ram>n)
            {
                System.out.println("So ban nhap nho hon so bi mat");
            }
            else if(ram<n)
            {
                System.out.println("So ban nhap lon hon so bi mat");
            }
        }
        while(ram!=n);
        System.out.println("Ban da doan dung");
    }
}
