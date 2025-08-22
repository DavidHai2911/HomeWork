package Exercise;
import java.util.Scanner;
public class Exercise3_DrawRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap chieu cao:");
        int h = s.nextInt();
        System.out.println("Nhap chieu rong:");
        int w = s.nextInt();
        for(int i = 1; i<=h ;i++)
        {
            for(int j = 1; j<=w ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
