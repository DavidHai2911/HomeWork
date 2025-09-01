package Exercise;
import java.util.Scanner;
public class Exercsie10_FindtheLongestCommonSubstring {
    public static String findLongestCommonSubstring(String s1, String s2) {
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        
        String longest = "";

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String sub = s1.substring(i, j);
                if (s2.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi 1: ");
        String str1 = sc.nextLine();

        System.out.print("Nhap chuoi 2: ");
        String str2 = sc.nextLine();

        String result = findLongestCommonSubstring(str1, str2);

        if (result.isEmpty()) {
            System.out.println("Khong có chuoi con chung.");
        } else {
            System.out.println("Chuoi con chung dai nhat: " + result);
        }
    }
}
