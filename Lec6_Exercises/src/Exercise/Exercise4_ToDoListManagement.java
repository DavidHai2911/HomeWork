package Exercise;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise4_ToDoListManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int n;

        do {
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Thoat");
            System.out.print("Chon task: ");
            n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.print("Chon task moi: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task da duoc them");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Ban khong task nao.");
                    } else {
                        System.out.println("Task cua ban:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Chon task can xoa: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Task da xoa");
                    } else {
                        System.out.println("Khong co task do");
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Nhap sai moi nhap lai");
            }
        } while (n != 4);
    }
}
