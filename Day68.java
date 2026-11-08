import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        //Day 78
        //membuat akun dan login menggunakan while

        Scanner in = new Scanner(System.in);

        //bagian daftar akun
        System.out.println("=== DAFTAR AKUN ===");

        System.out.print("Buat username : ");
        String username = in.nextLine();

        System.out.print("Buat password : ");
        String password = in.nextLine();

        System.out.println("Akun berhasil dibuat!");

        //bagian login
        System.out.println("\n=== LOGIN ===");

        String user;
        String pass;
        int percobaan = 0;

        while (true) {
            System.out.print("Username : ");
            user = in.nextLine();

            System.out.print("Password : ");
            pass = in.nextLine();

            percobaan++;

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("Login berhasil! Selamat datang, " + username);
                System.out.println("Jumlah percobaan login : " + percobaan);
                break;
            } else {
                System.out.println("Username atau password salah, coba lagi.\n");
            }
        }

  
    }
}
