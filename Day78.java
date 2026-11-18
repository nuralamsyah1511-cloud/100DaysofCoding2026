import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {

        // Day78
        // Membuat akun dan login ke akun menggunakan while

        Scanner in = new Scanner(System.in);

        // Membuat akun
        System.out.println("=== BUAT AKUN ===");

        System.out.print("Buat username: ");
        String u = in.nextLine();

        System.out.print("Buat password: ");
        String p = in.nextLine();

        System.out.println("\nAkun berhasil dibuat!");

        // Login
        System.out.println("\n=== LOGIN ===");

        String un;
        String ps;
        int percobaan = 0;

        while (true) {

            System.out.print("Masukkan username: ");
            un = in.nextLine();

            System.out.print("Masukkan password: ");
            ps = in.nextLine();

            percobaan++;

            if (un.equals(u) && ps.equals(p)) {
                System.out.println("\nLogin berhasil!");
                System.out.println("Jumlah percobaan: " + percobaan);
                break;
            } else {
                System.out.println("Username atau password salah!");
                System.out.println("Silakan coba lagi.\n");
            }
        }

        
    }
}
