import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {

        // Day37
        // Menentukan bilangan positif, negatif dan nol

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int a = in.nextInt();

        if (a > 0) {
            System.out.println("Angka tersebut adalah positif");
        } else if (a < 0) {
            System.out.println("Angka tersebut adalah negatif");
        } else {
            System.out.println("Angka tersebut adalah nol");
        }


    }
    
}
