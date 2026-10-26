public class Day55 {
    public static void main(String[] args) {
        //Day 55 
        //Latihan menggunakan continue, break, dan return

        //perulangan dimulai dari angka 1 samppai 10
        for (int i = 1; i <= 10; i++){
            
            if (i == 5){
                continue;
                //continue melewati satu putaran
            }


            if (i == 10){
                break;
                //break menghentikan perulangan
            }
            System.out.println(i+" ");

        }
        System.out.println();
        
        //memanggil method pesan
        pesan();
    }
    //method untuk menampilkan pesan
    static void pesan(){
        System.out.println("Program selesai");
        return; 
        //return mengakhiri method pesan
    }
}
