
import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {

        // Day 63
        // Mencetak hasil M pangkat N

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka M: ");
        int m = in.nextInt();

        System.out.print("Masukkan pangkat N: ");
        int n = in.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= m;
        }

        System.out.println(m + " pangkat " + n + " = " + hasil);

        in.close();
    }
}
