package Exercise;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise5_FilterEvenNumbers {
    public static ArrayList<Integer> getEvenNumbers(int[] arr) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        ArrayList<Integer> evenList = getEvenNumbers(numbers);
        System.out.println("Cac so chan trong mang: " + evenList);
    }
}
