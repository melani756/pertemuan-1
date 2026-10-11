package Pertemuan2;

public class KonversiSuhu {

    public static void konversiCelciusFahrenheit(double c, double f) {
        double fDariC = (c * 9/5) + 32;
        double cDariF = (f - 32) * 5/9;
        System.out.println(c + " °C ke Fahrenheit = " + fDariC + " °F");
        System.out.println(f + " °F ke Celcius    = " + cDariF + " °C");
    }

    public static void konversiCelciusReamur(double c, double r) {
        double rDariC = c * 4/5;
        double cDariR = r * 5/4;
        System.out.println(c + " °C ke Reamur     = " + rDariC + " °R");
        System.out.println(r + " °R ke Celcius    = " + cDariR + " °C");
    }

    public static void konversiFahrenheitReamur(double f, double r) {
        double rDariF = (f - 32) * 4/9;
        double fDariR = (r * 9/4) + 32;
        System.out.println(f + " °F ke Reamur     = " + rDariF + " °R");
        System.out.println(r + " °R ke Fahrenheit = " + fDariR + " °F");
    }

    public static void main(String[] args) {
        double c = 10;
        double f = 15;
        double r = 5;
        
        System.out.println("=== 9. Konversi Suhu (C=10, F=15, R=5) ===");
        System.out.println("\n--- a. Celcius & Fahrenheit ---");
        konversiCelciusFahrenheit(c, f); 
        
        System.out.println("\n--- b. Celcius & Reamur ---");
        konversiCelciusReamur(c, r);   
        
        System.out.println("\n--- c. Fahrenheit & Reamur ---");
        konversiFahrenheitReamur(f, r);  
    }
}
