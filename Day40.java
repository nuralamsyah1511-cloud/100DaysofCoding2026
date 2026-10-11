import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {

        // Menghitung harga tiket bioskop berdasarkan umur dan status mahasiswa

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan umur penonton: ");
        int umur = in.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = in.nextBoolean();

        int harga;

        if (umur < 12) {
            harga = 30000;
        } else if (umur <= 18) {
            harga = 40000;
        } else {
            harga = 50000;
        }

        System.out.println("Harga tiket sebelum diskon: Rp" + harga);

        if (mahasiswa) {
            int diskon = harga * 20 / 100;
            harga = harga - diskon;

            System.out.println("Diskon mahasiswa 20%");
        }

        System.out.println("Total bayar: Rp" + harga);

        in.close();
    }
}
