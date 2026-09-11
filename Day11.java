public class Day11 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);


        System.out.printf("Masukkan nama anda: ");
        String nama = input.nextLine();
        System.out.printf("Masukkan umur anda: ");
        int umur = input.nextInt();

        System.out.println("Nama anda adalah : "+nama);
        System.out.println("Umur anda adalah : "+umur);
    }
    
}
