public class Day22 {
    
    public static void main(String[] args) {
        //Day22
        // menukar nilai dua variabel
        int a = 10;
        int b = 20;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Menukar nilai menggunakan variabel sementara
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
