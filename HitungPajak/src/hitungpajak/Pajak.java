package hitungpajak;

public class Pajak {
    private String vendor;
    private String tipe;
    private double harga;
    
    public void setVendor (String vendor) {
        this.vendor = vendor;
    }
    
    public String getVendor () {
        return vendor;
    }
    
    public void setTipe (String tipe) {
        this.tipe = tipe;
    }
    
    public String getTipe () {
        return tipe;
    }
    
    public void setHarga (double harga) {
        this.harga = harga;
    }
    
    public double getHarga (){
        return harga;
    }
    
    //  menthod menghitung  ppn
    public double hitungppn() {
        if (harga > 8000000) {
            return harga * 0.05;
        } else if (harga > 4500000 && harga <= 8000000 ) {
            return harga * 0.02;
        } else if (harga > 4000000 ) {
            return harga * 0.01;
        } else {
            return 0;
        }
    }

    // method untuk menghitung  total harga
    public double hitungtotal() {
        return harga + hitungppn();
    }

    // method untuk  menmpilkan informasi
    //    public void tampilkanInfo() {
    //        System.out.println("Vendor: " + vendor);
    //        System.out.println("Tipe: " + tipe);
    //        System.out.println("Harga: " + harga);
    //        System.out.println("PPN: " + hitungppn());
    //        System.out.println("Total Harga (include ppn): " + hitungtotal());
    //    }
}