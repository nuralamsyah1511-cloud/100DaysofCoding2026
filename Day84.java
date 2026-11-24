import java.util.Scanner;
public class Day84{
    public static void main(String[] args) {
        //Day84 menentukan angka maksimal Array
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int n = in.nextInt();
        int[] a = new int[n];
        
        for( int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int maksimal = a[0];
        for(int i = 1; i < n; i++){
            if (a[i] > maksimal){
                maksimal = a[i];
            }
        }
        System.out.println(maksimal);
    }
}
