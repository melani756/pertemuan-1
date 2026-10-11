package Pertemuan2;

public class LuasSegitiga {

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        double a = 6; 
        double b = 8; 
        
        double luas = hitungLuasSegitiga(b, a);
        
        System.out.println("=== 5. Luas Segitiga ===");
        System.out.println("Alas = " + b + ", Tinggi = " + a);
        System.out.println("Luas Segitiga = " + luas);
    }
}