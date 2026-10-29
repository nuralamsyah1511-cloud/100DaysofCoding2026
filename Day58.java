import java.util.Scanner;

public class Day58{
    public static void main(String[] args) {
        // Day58
        // mencetak angka ganjil N-1 dan Angka Genap N-1
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int n = in.nextInt();

        System.out.print("Angka Ganjil: ");
        for (int i = n; i >= 1; i--){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("Angka Genap: ");
        for (int i = n; i >= 1; i--){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }

        in.close();

    }
}
