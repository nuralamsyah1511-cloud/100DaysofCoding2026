
import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {

        // Day41
        // Menentukan temperatur ruangan menggunakan if

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan temperatur ruangan: ");
        int suhu = in.nextInt();

        if (suhu < 10) {
            System.out.println("Ruangan terasa dingin");
        }

        if (suhu >= 10 && suhu <= 30) {
            System.out.println("Temperatur ruangan normal");
        }

        if (suhu > 30) {
            System.out.println("Ruangan terasa panas");
        }

        in.close();
    }
}
