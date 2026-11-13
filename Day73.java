import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        // Day73
        // Membuat menu berulang menggunakan do-while

        Scanner in = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU MAKANAN =====");
            System.out.println("1.Nasi Kuning");
            System.out.println("2.Bakso campur");
            System.out.println("3.Nasgor Special");
            System.out.println("4.Keluar");

            System.out.print("Pilih menu yang anda mau: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Nasi Kuning");
                    break;

                case 2:
                    System.out.println("Anda memilih Bakso Campur");
                    break;

                case 3:
                    System.out.println("Anda memilih Nasgor Special");
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan anda tidak tersedia!");
            }

        } while (pilihan != 4);

        
    }
}
