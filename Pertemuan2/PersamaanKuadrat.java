package Pertemuan2;

public class PersamaanKuadrat {

    public static int hitungPersamaan(int a, int b, int c) {
        return (b * b) - (4 * a * c);
    }

    public static void main(String[] args) {
        int a = 2, b = 10, c = 5;
        
        int hasil = hitungPersamaan(a, b, c);
        
        System.out.println("=== 3. Persamaan Kuadrat ===");
        System.out.println("Nilai a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Hasil (b^2 - 4ac) = " + hasil);
    }
}