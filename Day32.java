import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        // Day32
        // mengkombinasikan berbagai operator

        Scanner in = new Scanner(System.in);

        System.out.println("=== CEK NILAI ===");

        System.out.print("Maukkan nilai a: ");
        int a = in.nextInt();
        
        System.out.print("Maukkan nilai b: ");
        int b = in.nextInt();

        int nilai  = a * b;

        boolean hasil = nilai >= 75 && nilai <= 300;

        System.out.println("Hasil dari nilai : " + nilai);
        System.out.println("Apakah nilai lulus? " + hasil);

    }

}
