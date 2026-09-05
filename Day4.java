public class Day4 {
    public static void main(String[] args) {

        byte b=12;
        short s=32767;
        int i=327897867;
        long l=2147979848364778687L;


        System.out.println("==CONTOH BILANGAN==");
        System.out.println("Nilai byte:"+b);
        System.out.println("Nilai short: "+s);
        System.out.println("Nilai int:"+i);
        System.out.println("Nilai long:"+l);
        
        System.out.println("\n");

        System.out.println("==Value NiM dan MAX tipe datanumerik bilangan bulat==");
        System.out.println("Nilai byte dari bilangan "+Byte.MIN_VALUE+" sampai "+Byte.MAX_VALUE);
        System.out.println("Nilai Short dari bilangan "+Short.MIN_VALUE+" sampai "+Short.MAX_VALUE);
        System.out.println("Nilai int dari bilangan "+Integer.MIN_VALUE+" sampai "+Integer.MAX_VALUE);
        System.out.println("Nilai long dari bilangan "+Long.MIN_VALUE+" sampai "+Long.MAX_VALUE+"\n");
        
    }
    
}
