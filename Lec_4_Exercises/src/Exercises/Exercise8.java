package Exercises;
import java.util.Scanner;
public class Exercise8 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap x:"); 
        double x = s.nextDouble();
        System.out.println("Nhap y:"); 
        double y = s.nextDouble();
        if(x>0&&y>0)
        {System.out.println("The point is in the 1nd quadrant ");}
        if(x<0&&y>0)
        {System.out.println("The point is in the 2nd quadrant ");}
        if(x<0&&y<0)
        {System.out.println("The point is in the 3nd quadrant ");}
        if(x>0&&y<0)
        {System.out.println("The point is in the 4nd quadrant ");}
    }
}
