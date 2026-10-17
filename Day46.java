import java.util.Scanner;
public class Day46{
    public static void main (String [] args){
        // Day46
        // Membuat menu menggunakan switch-case
        Scanner in = new Scanner (System.in);

        System.out.println("===PILIHAN MENU MINUMAN===");
        System.out.println("1.Nutri Sari");
        System.out.println("2.Es Teh");
        System.out.println("3.Es Avocado Susu");
        System.out.println("4.Es Campur");

        System.out.print("Masukkan mneu pilihan anda (1-4) : ");
        int a = in.nextInt();

        switch (a) {
            case 1:
                System.out.println("Terimakasih anda sudah memilih Nutri Sari");
                break;
            case 2:
                System.out.println("Terimakasih anda sudah memilih Es Teh");
                break;
            case 3:
                System.out.println("Terimakasih anda sudah memilih Es Avocado Susu");
                break;
            case 4:
                System.out.println("Terimakasih anda sudah memilih Es Campur");
                break;
        
            default:
                System.out.println("Menu pilihan tidak valid");
                break;
        }
        in.close();

    }
}
