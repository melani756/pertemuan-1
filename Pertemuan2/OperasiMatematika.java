package Pertemuan2;

public class OperasiMatematika {

    public static void hitungOperasi(double x, double y) {
        System.out.println("Penjumlahan (x + y) : " + (x + y));
        System.out.println("Pengurangan (x - y) : " + (x - y));
        System.out.println("Perkalian (x * y)   : " + (x * y));
        System.out.println("Pembagian (x / y)   : " + (x / y));
    }

    public static void main(String[] args) {
        double x = 22;
        double y = 33;
        
        System.out.println("=== 4. Operasi Matematika (x = 22, y = 33) ===");
        
        hitungOperasi(x, y);
    }
}