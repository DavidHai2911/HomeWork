package Exercise;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String a = s.next();
        System.out.println("Nhap tuoi:");
        int b = s.nextInt();
        System.out.println("Hello "+a+",you are "+b+" years old.");
    }
}
