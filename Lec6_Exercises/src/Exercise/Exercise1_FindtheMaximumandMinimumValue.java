package Exercise;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise1_FindtheMaximumandMinimumValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so luong so:");
        int a = s.nextInt();
        int[] n= new int [a];
        
        System.out.println("Nhap so:");
        
        for (int i=0; i<a;i++)
        {
            n[i]= s.nextInt();        
        }
        
        int max= n[0];
        int min= n[0];
        
        for(int i = 0; i<a;i++)
        {
            if(n[i]>max)
            {
                max = n[i];
            }
            if(n[i]<min)
            {
                min = n[i];
            }
        }
        System.out.println("Gia tri lon nhat "+max);
        System.out.println("Gia tri nho nhat "+min);
    }
}
