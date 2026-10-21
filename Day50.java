import java.util.Scanner;

public class Day50{
    public static void main(String[] args) {
        // Day50
        // Menentukan bilangan ganjil atau genap mengguankan ternary

        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int a = in.nextInt();

        String hasil = (a % 2 == 0)?"Bilangan genap" : "Bilngan ganjil";

        System.out.println("Keterangan: "+hasil);
    }
}
