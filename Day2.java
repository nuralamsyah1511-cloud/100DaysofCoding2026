public class Day2 {
    public static void main(String[] args) {
        
        String nama, alamat, nim, wa;

        nama = "Nur Alamsyah";
        alamat = "Tinambung";
        nim = "D0226318";
        wa = "085941921511";

        System.out.println("=========BIODATA=========");        
        System.out.println("Nama \t\t: "+ nama);        
        System.out.println("Alamat \t\t: "+ alamat);        
        System.out.println("Nim \t\t: "+ nim);
        System.out.println("WhatsApp \t: "+ wa);
        
        System.out.println("\n");

        System.out.print("Nama \t\t: "+ nama + "\n");
        System.out.print("Alamat \t\t: "+ alamat + "\n");
        System.out.print("Nim \t\t: "+ nim + "\n");
        System.out.print("WhatsApp \t: "+ wa + "\n");

        System.out.println("\n");

        System.out.printf("Nama \t\t: %s \n", nama);
        System.out.printf("Alamat \t\t: %s \n", alamat);
        System.out.printf("Nim \t\t: %s \n", nim);
        System.out.printf("WhatsApp \t: %s \n", wa);
        System.out.println("================================");
    }
    
}
