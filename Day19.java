public class Day19 {
    public static void main(String[] args) {
        //Day 19
        //Konversi manual/faksa [Dari tipe Data Besar Ke Kecil]

        long L = 12345678910l;
        int I = (int) L;
        short S =(short) I;
        byte A = (byte) S;

        System.out.printf("Long %s :%d %n","",L);
        System.out.printf("dari Long ke int :%d %n",I);
        System.out.printf("dari Integer ke Short :%d %n",S);
        System.out.printf("dari Short ke Byte:%d %n",A);
        
    }
    
}
