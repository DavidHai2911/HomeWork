package Exercise;
import java.util.Scanner;
public class Exercise10_DrawTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap chieu cao:");
        int h = s.nextInt();
        for(int i = 1; i<=h ;i++)
        {
            for(int j = 1;j<=h-i;j++)
                {
                    System.out.print(" ");
                }
                for(int e = 1;e<=2*i-1   ;e++)
                {
                    if (e == 1 || e == 2 * i - 1 || i == h) 
                    {
                        System.out.print("*");
                    } 
                    else 
                    {
                        System.out.print(" ");
                    }
                }System.out.println();
        }
    }
}
    