import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        // Day 72
        // Penjumlahan angka berhenti ketika menginputkan angka negatif

        Scanner in = new Scanner(System.in);

        int angka;
        int jumlah = 0;

        System.out.print("masukkan angka: ");
        angka = in.nextInt();

        while (angka >= 0) {
            jumlah += angka;

            System.out.print("masukkan angka: ");
            angka = in.nextInt();
        }
        System.out.println("hasil penjumlahan: " + jumlah);

        
    }
}
