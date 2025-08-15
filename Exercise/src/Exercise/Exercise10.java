package Exercise;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("##|\\n");
        System.out.println("Nhap bang ##:");
        while(s.hasNext()){
            System.out.println(s.next());
        }
        s.close();
    }
}
