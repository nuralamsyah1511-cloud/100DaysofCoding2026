import java.util.Scanner;
public class Day47{
    public static void main (String [] args) {
        // Day47
        // Menentukan hari menggunakan switch-case

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka Hari ( 1-7 ) : ");
        int a = in.nextInt();

        switch(a){
            case 1:
                System.out.println("Hari senin");
                break;

            case 2:
                System.out.println("Hari selasa");
                break;

            case 3:
                System.out.println("Hari rabu");
                break;

            case 4:
                System.out.println("hari kamis");
                break;

            case 5:
                System.out.println("Hari jumat");
                break;

            case 6:
                System.out.println("Hari sabtu");
                break;

            case 7:
                System.out.println("Hari minggu");
                break;

            default:
                System.out.println("Angka hari yang anda masukkan tidak valid");

        }
        in.close();
    }
}
