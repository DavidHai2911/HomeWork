package Exercise;
import java.util.Scanner;
public class Exercise6_FindtheLongestWordinaSentence {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap: ");
        String sentence = sc.nextLine();
        
        String longest = findLongestWord(sentence);
        System.out.println("Tu dai nhat la: " + longest);
    }
}
