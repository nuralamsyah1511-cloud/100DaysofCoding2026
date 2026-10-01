import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        //Day 31
        //operator logika AND (&&),OR (||),dan NOT (!)

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int a = in.nextInt();

        System.out.print("Masukkan angka kedua : ");
        int b = in.nextInt();

        System.out.println("AND (&&) : " + (a > b && b > a));
        System.out.println("OR (||) : " + (a > b || b > a));
        System.out.println("NOT (!) : " + !(a > b));

        
    }
    
}
