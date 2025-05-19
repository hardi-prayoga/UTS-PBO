package bangunruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // input dan output untuk kubus
        System.out.println("masukkan nilai rusuk : ");
        int rusuk = input.nextInt();
        new BangunRuang(rusuk);
        
        System.out.println("----------------------------");
        
        // input dan output untuk balok
        System.out.println("masukkan nilai panjang : ");
        double panjang = input.nextDouble();
        System.out.println("masukkan nilai lebar : ");
        double lebar = input.nextDouble();
        System.out.println("masukkan nilai tinggi : ");
        double tinggi = input.nextDouble();
        new BangunRuang(panjang, lebar, tinggi);
        
        System.out.println("----------------------------");
        
        // input dan output untuk silinder
        System.out.println("masukkan nilai jari : ");
        double jari = input.nextDouble();
        System.out.println("masukkan nilai tinggi : ");
        double tinggi2 = input.nextDouble();
        new BangunRuang(jari, tinggi2);
        
        System.out.println("----------------------------");
        
        // input dan output untuk bola
        System.out.println("masukkan nilai jari-jari : ");
        double jari2 = input.nextDouble();
        new BangunRuang(jari2);
    }
}
