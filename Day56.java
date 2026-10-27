import java.util.Scanner;
public class Day56{
    public static void main (String[] args) {
        //Day 56
        //Latihan mengcetak angka 1-N dan N-1
        
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan batas nilai: ");
        int n = in.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.print(i+" ");

        }System.out.println();

        for(int i = n; i >= 1; i--){
            System.out.print(i+" ");
        }
    }
}
