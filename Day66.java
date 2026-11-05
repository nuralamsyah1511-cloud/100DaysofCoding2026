import java.util.Scanner;

public class Day66{
    public static void main(String[] args) {
        // Day 66
        // Membuat pola garis horizontal

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan panjang garis: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("_");
        }


    }
}
