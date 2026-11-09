import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        // Day 69
        // Latihan Membuat Pola Persegi Panjang

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = in.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = in.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
