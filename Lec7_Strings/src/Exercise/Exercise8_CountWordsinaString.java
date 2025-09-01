package Exercise;
import java.util.Scanner;
public class Exercise8_CountWordsinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap: ");
        String input = sc.nextLine();
        input = input.trim();

        if (input.isEmpty()) {
            System.out.println("Số từ: 0");
            return;
        }


        String[] words = input.split("\\s+");

        System.out.println("So tu: " + words.length);
    }
}
