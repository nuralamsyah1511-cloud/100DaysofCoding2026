import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int jumlah = 0;

        for (int i = 1; i <= N; i++) {
            jumlah = jumlah + i;
        }

        System.out.println(jumlah);

        in.close();
    }
    
}
