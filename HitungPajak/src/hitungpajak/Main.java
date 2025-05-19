package hitungpajak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pajak smartphone = new Pajak();
        
        System.out.print("masukan vendor : ");
        smartphone.setVendor(input.nextLine());
           
        System.out.print("masukan tipe : ");
        smartphone.setTipe(input.nextLine());
        
        System.out.print("masukan harga : ");
        smartphone.setHarga(input.nextDouble());
          
        // menampilkan info ponsel
        System.out.println(" \n -----HASIL----- ");
        System.out.println("Vendor: " + smartphone.getVendor());
        System.out.println("Tipe: " + smartphone.getTipe());
        System.out.println("Harga: " + smartphone.getHarga());
        System.out.println("PPN: " + smartphone.hitungppn());
        System.out.println("Total Harga (include ppn): " + smartphone.hitungtotal());
    }   
}
