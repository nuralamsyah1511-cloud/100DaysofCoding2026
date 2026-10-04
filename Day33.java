import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        // Day 33
        // Percabangan (if else)

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        if (nilai >= 70) {
            System.out.println("Kamu dinyatakan LULUS");
        } else {
            System.out.println("Kamu dinyatakan TIDAK LULUS");
        }

    }

}
