package Exercise;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 2 so thuc:");
        float a = s.nextFloat();
        float b = s.nextFloat();
        float ave = (a+b)/2;
        System.out.println("Tong trung binh: "+ave);
    }
}
