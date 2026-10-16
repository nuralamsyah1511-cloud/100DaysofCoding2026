import java.util.Scanner;

public class lat16 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("====MENU MAKANAN====");
        System.out.println("1.Nasi goreng");
        System.out.println("2.Mie ayam");
        System.out.println("3.Ayam goreng");

        System.out.print("Masukkan nomor pilihan : ");
        int a = in.nextInt();

        switch (a) {
            case 1:
                System.out.println("Nasi goreng");
                break;
            case 2:
                System.out.println("Mie ayam");
                break;
            case 3:
                System.out.println("Ayam goreng");
                break;
            default:
                System.out.println("Pilihan Tidak Falid");
                break;
        }
        in.close();
    }
}
