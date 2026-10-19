import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        // Day48
        // membuat kakulator menggunakan switch-case

        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan operator (+,-,*,/,%): ");
        char b = in.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        int c = in.nextInt(); 

        switch(b){
            case '+':
                System.out.println("Hasil: "+(a + c));
                break;
            case '-':
                System.out.println("Hasil: "+(a - c));
                break;
            case '*':
                System.out.println("Hasil: "+(a * c));
                break;
            case '/':
                if (c != 0){
                    System.out.println("Hasil: "+((double)a / c));
                }else{
                    System.out.println("Tidak dapat dibangi 0");
                }

                break;
            case '%':
                System.out.println("Hasil: "+(a %  c));
                break;
        }
        in.close();
        
    }
}
