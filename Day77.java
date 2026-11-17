import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {

        // Day77
        // Latihan menggunakan berbagai method String

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata: ");
        String kata = in.nextLine();

        System.out.println("Jumlah karakter: " + kata.length());

        System.out.println("Huruf kapital: " + kata.toUpperCase());

        System.out.println("Huruf kecil: " + kata.toLowerCase());

        System.out.println("Apakah kata sama dengan Java? " 
                + kata.equals("Java"));

        System.out.println("Apakah mengandung huruf a? " 
                + kata.contains("a"));

        System.out.println("Mengganti a menjadi o: " 
                + kata.replace("a", "o"));

        
    }
}
