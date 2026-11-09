import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        // Day 69
        // Latihan Membuat Pola Persegi Panjang

        Scanner in = new Scanner(System.in);

        System.out.print("masukkan jumlah baris: ");
        int ba = in.nextInt();

        System.out.print("masukkan jumlah kolom: ");
        int ko = in.nextInt();

        for (int i = 1; i <= ba; i++) {
            for (int j = 1; j <= ko; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}
