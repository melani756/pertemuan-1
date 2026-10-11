package Pertemuan2;

public class WaktuTempuh {

    public static double hitungWaktu(double jarakKm, double kecepatanCahaya) {
        double detik = jarakKm / kecepatanCahaya;
        return detik / 3600;
    }

    public static void main(String[] args) {
        double jarakBulan = 384400;          
        double jarakMatahari = 152100000;    
        double kecCahaya = 300000;           

        double waktuBulan = hitungWaktu(jarakBulan, kecCahaya);
        double waktuMatahari = hitungWaktu(jarakMatahari, kecCahaya);
        
        System.out.println("=== 8. Waktu Tempuh Cahaya ===");
        System.out.println("Waktu ke Bulan     = " + waktuBulan + " jam");
        System.out.println("Waktu ke Matahari  = " + waktuMatahari + " jam");
    }
}