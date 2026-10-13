import java.util.Scanner;
public class Day42{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Day42
        // menentukan gaji bersih

        System.out.print("Masukkan Gaji pokok :Rp ");
        double gp = in.nextDouble();

        System.out.print("masukkan Potongan gaji :RP ");
        double pg = in.nextDouble();

        double gajiBersih = gp - pg ;

        if(gajiBersih > 0){
            System.out.println("Gaji bersih :Rp"+gajiBersih);
        }else if(gajiBersih == 0){
            System.out.println("Gaji bersi habis karna potongan");
        }else{
            System.out.println("Potongan melebihi Gaji pokok");
        }
        in.close();
    }
}
