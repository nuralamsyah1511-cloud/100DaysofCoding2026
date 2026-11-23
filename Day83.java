import java.util.Scanner;
public class Day83{
    public static void main(String[] args) {
        //Day83 menjumlahkan elemen Array
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = in.nextInt();

        int[] a = new int[n];
        int j = 0;

        for( int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++){
            j += a[i];
        }
        System.out.println(j);
    }
}
