
package Exercise;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Exercise1_ReverseWordsentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] s = a.split(" ");
        for (int i = s.length - 1; i>=0 ;i--){
            System.out.print(s[i] + " ");
        }
    }
}