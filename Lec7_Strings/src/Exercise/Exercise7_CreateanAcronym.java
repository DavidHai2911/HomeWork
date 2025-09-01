package Exercise;
import java.util.Scanner;
public class Exercise7_CreateanAcronym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap: ");
        String phrase = sc.nextLine();
        String[] words = phrase.trim().split("\\s+");
        StringBuilder acronym = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                acronym.append(firstChar);
            }
        }

        System.out.println(acronym.toString());
    }
}
