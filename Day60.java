import java.util.Scanner;

public class Day60 {
    public static void main(String[] args){
        //Day60
        //Menjumlahkan angka dari 1 sampai N
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan batas angka: ");
        int n = in.nextInt();
        int jumlah = 0;

        for (int i = 1; i <= n; i++){
            jumlah += i;
            if (i == n ){
                System.out.print(i+ " ");
            }else {
                System.out.print(i+ " + ");
            }

        }
        System.out.print(" = "+jumlah);
        
    }
}
