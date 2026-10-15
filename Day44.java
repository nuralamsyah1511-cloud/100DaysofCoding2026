import java.util.Scanner;
public class Day44{
    public static void main(String[] args){

        // Day44
        // Program Prediksi Nilai (A, B, C, D, E)

        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan Angka : ");
        int a = in.nextInt();

        if (a < 0 || a > 100 ){
            System.out.println("Nilai terpantau tidak valid");
        }else if ( a >= 90 ){
            System.out.println("Nilai A");
        }else if ( a >= 80 ){
            System.out.println("Nilai B");
        }else if ( a >= 75 ){
            System.out.println("Nilai C");
        }else if ( a >= 65 ){
            System.out.println("Nilai D");
        }else {
            System.out.println("Nilai terpantau E");
        }
        in.close();
    }
}
