import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        // Day39
        // Membuat kalkulator menggunakan if

        Scanner in = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDERHANA =====");
        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = in.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();

        if (operator == '+') {
            System.out.println("Hasil: " + (a + b));
        }

        if (operator == '-') {
            System.out.println("Hasil: " + (a - b));
        }

        if (operator == '*') {
            System.out.println("Hasil: " + (a * b));
        }

        if (operator == '/') {
            if (b != 0) {
                System.out.println("Hasil: " + (a / b));
            } else {
                System.out.println("Tidak bisa dibagi dengan nol");
            }

        }

        in.close();
    }

}
