import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        //Day35
        //nested if

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        if (nilai >= 0) {
            if (nilai >= 75) {
                System.out.println("Nilai kamu LULUS");
            } else {
                System.out.println("Nilai kamu TIDAK LULUS");
            }
        } else {
            System.out.println("Nilai tidak valid");
        }
        
    }

}
