import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        //Day24
        //Program menghitung luas persegi panjang

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi :");
        int panjang = in.nextInt();

        System.out.print("Masukkan lebar persegi :");
        int lebar = in.nextInt();
        
        //Rumus menghitung luas persegi panjang

        int luas = panjang*lebar;

        System.out.printf("Jadi luas Persegi Panjang%ndengan Panjang %d cm,dan Lebar %d cm Adalah%nLuas = %d cm",panjang,lebar,luas);
    }
  
}
