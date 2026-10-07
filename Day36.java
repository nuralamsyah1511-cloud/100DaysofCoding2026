import java.util.Scanner ;

public class Day36{
    public static void main (String[] args){
        // Day36
        // menentukan bilangan ganjil dan genap

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka :");
        int a = in.nextInt();

         if (a % 2 == 0) {
            System.out.println("Angka tersebut adalah bilangan genap");
        } else {
            System.out.println("Angka tersebut adalah bilangan ganjil");
        }


    }
}
