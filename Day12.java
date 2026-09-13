public class Day12 {

    public static void main(String[] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("=======BIODATA=======");
        System.out.print("Masukkan Nama:");
        String nama = input.nextLine();

        System.out.print("Masukkan Prodi:");
        String prodi = input.nextLine();

        System.out.print("Masukkan NIM:");
        String nim = input.nextLine();

        System.out.print("Masukkan Umur:");
        byte umur = input.nextByte();


        System.out.println("\n========BIODATA=======");
        System.out.println("Nama saya:"+nama);
        System.out.println("Prodi saya:"+prodi);
        System.out.println("NIM saya:"+nim);
        System.out.println("Umur saya:"+umur+ "tahun");
        System.out.println("");
        
    }
}
