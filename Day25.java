import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        //Day25
        //program menghitung luas lingkaran
        
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = in.nextDouble();

        //Rumus mencari luas lingkaran
        double phi = 3.14;
        double luas = phi * jariJari * jariJari;

        System.out.printf("Jadi luas lingkaran dengan jari-jari : %.2f cm %nadalah : %.2f cm%n",jariJari, luas);
    }

}
    
