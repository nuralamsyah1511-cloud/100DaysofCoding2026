import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();

        System.out.println("Apakah a lebih kecil dari b? " + (a < b));
        System.out.println("Apakah a lebih besar dari b? " + (a > b)); 
        
    }

}
