import java.util.Scanner;
public class Day85{
    public static void main(String[] args) {
        //Day85 menentukan angka minimal Array
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = in.nextInt();

        int[] a = new int[n];
        
        for( int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        
        int minimal = a[0];
        for(int i = 1; i < n; i++){
            if (a[i] < minimal){
                minimal = a[i];

            }
        }
        System.out.println(minimal);
    }
}
