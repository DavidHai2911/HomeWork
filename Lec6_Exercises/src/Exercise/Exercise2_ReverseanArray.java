package Exercise;
import java.util.Scanner;
import java.util.ArrayList; 
public class Exercise2_ReverseanArray {
       public static void reverse(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }
    }
       
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        reverse(arr);
        System.out.println("Mang sau khi dao nguoc:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
