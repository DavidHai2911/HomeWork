package Exercise;
import java.util.Scanner;
public class Exercise2_CapitalizeaProperName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String a = sc.nextLine();
        String b = a.trim();
        String[] c = b.split("\\s+");
        StringBuilder d = new StringBuilder();
        for (String w : c) {
            if (!b.isEmpty()) {
                String f = w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase();
                d.append(f).append(" ");
            }
        }
        String e = d.toString().trim();
        System.out.println(e);
    }
}
