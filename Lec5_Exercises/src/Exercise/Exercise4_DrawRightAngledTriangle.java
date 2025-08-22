package Exercise;
import java.util.Scanner;
public class Exercise4_DrawRightAngledTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap chieu cao:");
        int h = s.nextInt();
        for(int i = 1; i<=h;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }System.out.println();
        }
    }
}
