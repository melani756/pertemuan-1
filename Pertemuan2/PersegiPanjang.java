package Pertemuan2;

public class PersegiPanjang {

    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        int p = 50;
        int l = 45;
        
        
        int hasilLuas = hitungLuas(p, l);
        
        System.out.println("=== 2. Luas Persegi Panjang ===");
        System.out.println("Panjang: " + p + ", Lebar: " + l);
        System.out.println("Luas Persegi Panjang = " + hasilLuas);
    }
}
