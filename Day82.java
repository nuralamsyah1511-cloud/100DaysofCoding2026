import java.util.Scanner;
public class Day82{
    public static void main(String[] args) {
        //Day 82
        //Menetukan nilai terbesar dari Deretan Array
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah angka: ");
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int t = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] > t){
                t = a[i];
            }

        }
        System.out.println("Terbesar: "+t);

    }
}
