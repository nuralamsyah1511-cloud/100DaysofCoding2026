import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        //Day87 manipulasi data dalam Array
        Scanner in = new Scanner(System.in);

        int[] a = {10, 100, 1000, 10000,};

        System.out.println("Data sebelum diubah:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // Mengubah data array
        a[2] = 500;

        System.out.println("\n\nData setelah diubah:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
