import java.util.Scanner;

public class Day57{
    public static void main(String[] args) {
        //Day56
        //mencetak angka ganjil 1-N dan angka genap 1-N
        Scanner in = new Scanner(System.in);
    
        System.out.print("Masukkann batas angka: ");
        int n = in.nextInt();

        System.out.print("Angka genap: ");
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
             
        }
        System.out.println();
        System.out.print("Angka ganjil: ");
        for (int i = 0; i <= n; i++){
            if (i % 2 != 0){
                System.out.print(i+" ");
             }
        }
    }
}
