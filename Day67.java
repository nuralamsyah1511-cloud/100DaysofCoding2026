import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        //Day67
        //Latihan membuat pola persegi

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan ukuran persegi: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            for(int s = 1; s <= n; s++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}
