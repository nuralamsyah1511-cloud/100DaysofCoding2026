import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        // Day 65
        // Membuat pola garis vertikal

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan tinggi garis: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

    }
}
