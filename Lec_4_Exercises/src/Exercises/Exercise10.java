package Exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 3 canh :"); 
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if((a+b)>c)
        {
            if(a==b && b==c)
            {
                System.out.println("This is an equilateral triangle."); 
            }
            else if(a==b)
            {
                System.out.println("This is an isosceles triangle."); 
            }
            else
            {
                System.out.println("This is a scalene triangle."); 
            }
        }
        else
        {
            System.out.println("These sides cannot form a triangle."); 
        }
    }
}
