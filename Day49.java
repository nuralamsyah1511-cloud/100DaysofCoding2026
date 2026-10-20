import java.util.Scanner;
public class Day49 {
    public static void main (String [] args){
        // Day49
        // operator ternary
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan total belanja: Rp");
        int angka = in.nextInt();

        String hasil = (angka >= 10000) ? "mendapatkan diskon" : "Tidak mendapatkan diskon";

        System.out.println("Hasil: "+hasil);

        in.close();
    }
    
}
