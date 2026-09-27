import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Saldo: Rp");
        int saldo = in.nextInt();

        System.out.print("Jumlah penarikan: Rp");
        int tarik = in.nextInt();

        int berhasil = Math.min(saldo, tarik) / 100000 * 100000;
        int lembar = berhasil / 100000;
        int gagal = tarik - berhasil;

        System.out.println("\nUang berhasil ditarik : Rp" + berhasil);
        System.out.println("Jumlah lembar : " + lembar);
        System.out.println("Uang gagal ditarik : Rp" + gagal);
    }
    
}
    
