package bangunruang;

public class BangunRuang { 
    
    //kubus
    public BangunRuang (int rusuk) {
        double volume = Math.pow(rusuk, 3);
        double luas = Math.pow(rusuk, 2) * 6;
        display(volume, luas, "kubus");
    }
    
    //balok
    public BangunRuang (double panjang, double lebar, double tinggi) {
        double volume = panjang * lebar * tinggi;
        double luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        display(volume, luas, "balok");
    }
    
    //silinder
    public BangunRuang (double jari, double tinggi) {
        double volume = Math.PI * Math.pow(jari, 2) * tinggi;
        double luas = 2 * Math.PI * jari * (jari + tinggi);
        display(volume, luas, "silinder");
    }
    
    // bola
    public BangunRuang (double jari) {
        double volume = (4.0/3) * Math.pow(jari, 3) * Math.PI;
        double luas = 4 * Math.PI * Math.pow(jari, 2);
        display(volume, luas, "bola");
    }
    
    public static void display (double volume, double luas, String namabangun) {
        System.out.println("Volume dari " + namabangun + " adalah: ");
        System.out.println(volume);
        System.out.println("Luas permukaan dari " + namabangun + " adalah: ");
        System.out.println(luas);
    }
}