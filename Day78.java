import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {

        // Day78
        // Membuat akun dan login ke akun menggunakan while

        Scanner in = new Scanner(System.in);

        // Membuat akun
        System.out.println("=== BUAT AKUN ===");

        System.out.print("Buat username: ");
        String username = in.nextLine();

        System.out.print("Buat password: ");
        String password = in.nextLine();

        System.out.println("\nAkun berhasil dibuat!");

        // Login
        System.out.println("\n=== LOGIN ===");

        String user;
        String pass;
        int percobaan = 0;

        while (true) {

            System.out.print("Masukkan username: ");
            user = in.nextLine();

            System.out.print("Masukkan password: ");
            pass = in.nextLine();

            percobaan++;

            if (user.equals(username) && pass.equals(password)) {
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
