import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        // Day74
        // Method String Dasar

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata: ");
        String kata = in.nextLine();

        // Menghitung jumlah karakter
        System.out.println("Jumlah karakter: " + kata.length());

        // Mengubah menjadi huruf kapital
        System.out.println("Huruf kapital: " + kata.toUpperCase());

        // Mengubah menjadi huruf kecil
        System.out.println("Huruf kecil: " + kata.toLowerCase());

        
    }
}
