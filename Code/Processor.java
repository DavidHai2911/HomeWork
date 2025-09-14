package Code;

import java.util.*;
import java.text.*;

public class Processor {

    public static void main(String[] args) {
        Person_List List = new Person_List();
        Scanner sc = new Scanner(System.in);
        int choose_continue;
        do {
            System.out.println("Menu:");
            System.out.println("1.Exit");
            System.out.println("2.Enter informations");
            System.out.println("3.Out put list");
            System.out.println("Chose:");
            choose_continue = Integer.parseInt(sc.nextLine());
            switch (choose_continue) {
                case 1:
                    System.out.println("Exiting...");
                    break;
                case 2:
                    System.out.println("Who(1-Student, 2-Teacher)");
                    int chose = Integer.parseInt(sc.nextLine());
                    if (chose == 1) {
                        Student s = new Student();
                        List.add(s);
                    } else if (chose == 2) {
                        Teacher t = new Teacher();
                        List.add(t);
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 3:
                    List.out();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choose_continue != 1);
    }
}
