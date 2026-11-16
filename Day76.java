import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        // Day76
        // Method String untuk Manipulasi

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah teks: ");
        String teks = in.nextLine();

        // Menghapus spasi di awal dan akhir
        System.out.println("Hasil trim: " + teks.trim());

        // Mengambil sebagian teks
        String bersih = teks.trim();
        System.out.println("Hasil substring: " + bersih.substring(0, bersih.length() / 2));

        // Mengganti karakter atau kata
        System.out.println("Hasil replace: " + bersih.replace("s", "t"));

      
    }
}
