package Exercises;

import java.util.Scanner;

public class Exercise4 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen:");
        int a = s.nextInt();
        int b = s.nextInt();
        s.nextLine();
        System.out.println("Nhap phep tinh:");
        String c = s.nextLine();
            switch (c) {
                case "+" : System.out.println(a+"+"+b+"="+(a+b));break;
                case "-" : System.out.println(a+"-"+b+"="+(a-b));break;
                case "*" : System.out.println(a+"*"+b+"="+(a*b));break;
                case "/" : System.out.println(a+"/"+b+"="+(a/b));break;
                default:System.out.println("Ky tu ko hop le");break;
            }
    }
}
    