package Exercise;
import java.util.Scanner;
public class Exercise3_StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0); 
        int count = 1; 
        
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++; 
            } else {            
                compressed.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        compressed.append(currentChar).append(count);
        System.out.println(compressed.toString());
    }
}
