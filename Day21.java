public class Day21 {
    public static void main(String[] args) {
        String umur ="10";
        String tinggi ="167.5";
        String jenisKelamin="Laki";
        String  A ="true";
        String beratBadan="57";

        byte umurByte = Byte.parseByte(umur);
        System.out.println("String byte dalam bentuk byte: "+umurByte);

        double tinggiDouble = Double.parseDouble(tinggi);
        System.out.println("String doble dalam bentuk double: "+tinggiDouble);

        char jenisKelaminChar = jenisKelamin.charAt(0);
        System.out.println("String char dalam bentuk char: "+jenisKelaminChar);

        boolean ABoolean = Boolean.parseBoolean(A);
        System.out.println("String boolean dalam bentuk boolean: "+ABoolean);

        float beratBadanFloat = Float.parseFloat(beratBadan);
        System.out.println("String float dalam bentuk float: "+beratBadanFloat);

    }
    
}
