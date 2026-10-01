import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        //Day30
        //Operator perbandingan <= dan >=

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();

        System.out.println("Apakah a lebih kecil atau sama dengan b? " + (a <= b));
        System.out.println("Apakah a lebih besar atau sama dengan b? " + (a >= b));

    }

}
