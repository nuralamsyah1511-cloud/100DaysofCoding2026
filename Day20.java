public class Day20 {
    public static void main(String[] args) {
        //Day20
        //mengubah data primitif kedata string

        int a = 18;
        double b = 167.5;
        boolean c = true;
        char d = 'A';
        
        //mengubah data primitif menjadi string
        String aa =String.valueOf(a);
        String bb =String.valueOf(b);
        String cc =String.valueOf(c);
        String dd =String.valueOf(d);

        System.out.println("int ke String:"+aa);
        System.out.println("double ke String:"+bb);
        System.out.println("boolean ke String:"+cc);
        System.out.println("char ke String:"+dd);

    }
    
}
