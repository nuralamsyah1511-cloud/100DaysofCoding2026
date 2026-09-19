public class Day18 {
    public static void main(String[] args) {
        // Day18
        // Konversi Otomatis[dari tipe data kecil ke besar]

        byte A = 5;
        short B = A;
        int C = B;
        long D = C;
        float E = D;
        double F = E;
        
        System.out.println();
        System.out.println("dari Byte:"+A);
        System.out.println("dari Byte ke Short:"+B);
        System.out.println("dari Short ke Integer:"+C);
        System.out.println("dari Integer ke Long:"+D);
        System.out.println("dari Long ke Float:"+E);
        System.out.println("dari Float ke Double:"+F);
        System.out.println();

    }
    
}
