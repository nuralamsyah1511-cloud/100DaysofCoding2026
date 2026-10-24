import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan angka batas: ");
        int a = in.nextInt();

        int i = 1;

        do {
            System.out.println(i);
            i++;
        }while (i <= a);

        in.close();

    }
}
