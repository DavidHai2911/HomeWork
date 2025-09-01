package Exercise;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise4_CheckforAnagrams {
     public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
 
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập chuoi 1: ");
        String str1 = sc.nextLine();
        
        System.out.print("Nhập chuoi 2: ");
        String str2 = sc.nextLine();
        
        if (isAnagram(str1, str2)) {
            System.out.println("Hai chuoi la Anagram!");
        } else {
            System.out.println("Hai chuoi khong phai la Anagram.");
        }
    }
}
