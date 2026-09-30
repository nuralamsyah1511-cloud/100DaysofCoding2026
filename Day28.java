import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();

        System.out.println("Apakah kedua angka sama? " + (a == b));
        System.out.println("Apakah kedua angka berbeda? " + (a != b));
    
    }
    
}
