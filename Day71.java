import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        //Day 71
        //Membuat pola segitiga siku-siku terbalik

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int n = in.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        in.close();
    }
}
