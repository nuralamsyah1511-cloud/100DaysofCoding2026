import java.util.Scanner;

public class Day61{
    public static void main(String[] args) {
        //Day61
        //Mengalikan angka 1 sampai N

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Batas Angka N: ");
        int n = in.nextInt();
        int hasil= 1;

        for(int i = 1; i <= n; i++){
            hasil *=i;

        }
        System.out.print(hasil);
    }
 
}
