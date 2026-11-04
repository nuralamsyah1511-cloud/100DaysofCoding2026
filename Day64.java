import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {

        // Day 64
        // Membuat bilangan faktorial

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = in.nextInt();

        int faktorial = 1;

        if (n < 0) {
            System.out.println("Bilangan negatif tidak memiliki faktorial.");

        } else {
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }

            System.out.println("Hasil faktorial dari " + n + " adalah: " + faktorial);
        }

        in.close();
    }
}
