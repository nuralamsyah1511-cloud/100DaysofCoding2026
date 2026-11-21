import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        // Day81
        // Mengisi Elemen Array dan Menampilkan Semua Elemen Array
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = in.nextInt();
        int[] a = new int[n];

        // Mengisi elemen array
        for (int i = 0; i < n; i++) {
            System.out.print("");
            a[i] = in.nextInt();
        }

        // Menampilkan semua elemen array
        System.out.println("Isi semua elemen array:");

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

       
    }
}
