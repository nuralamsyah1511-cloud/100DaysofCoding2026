import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan nama anda :");
        String nama = in.nextLine();

        System.out.print("Maukkan umur anda :");
        byte umur = in.nextByte();

        System.out.print("Masukkan tinggi badan anda :");
        double tb = in.nextDouble();

        System.out.print("Masukkan berat badan anda :");
        float bb = in.nextFloat();

        System.out.print("Masukkan jenis kelamin anda :");
        char jk = in.next().charAt(0);
        in.nextLine();

        System.out.print("Masukkan nomor telepon anda :");
        String nomor  = in.nextLine();


        System.out.println("\n\t=======OUTPUT=======");
        System.out.println("Nama anda          :"+nama);
        System.out.println("Umur anda          :"+umur+"tahun");
        System.out.println("Tinggi Badan anda  :"+tb+"cm");
        System.out.println("Berat Badan anda   :"+bb+"kg");
        System.out.println("Jenis Kelamin anda :"+jk);
        System.out.println("Nomor Telpon anda  :"+nomor);
        System.out.println("");


    }
    
}
