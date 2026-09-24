import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Day23
        //program menghitung luas persegi

        System.out.print("masukkan panjang sisi :");
        int sisi = in.nextInt();


        int luas=sisi*sisi;

        System.out.println("jadi luas persegi: "+luas);
    }
    
}
