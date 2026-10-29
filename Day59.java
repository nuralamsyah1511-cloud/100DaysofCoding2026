import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {

        // Day 59
        // Mencetak bilangan kelipatan M dari 1-N

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas angka n: ");
        int n = in.nextInt();

        System.out.print("Masukkan angka m: ");
        int m = in.nextInt();

        System.out.print("Kelipatan " + m + " dari 1 sampai " + n + " : ");

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }

        in.close();
    }
}
