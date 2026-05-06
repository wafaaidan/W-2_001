public class Main {
    public static void main(String[] args) {
    elektronik laptop = new elektronik("Laptop Asus", "Asus", 85000000, 10, 2);
    elektronik hp = new elektronik("HP Samsung", "Samsung", 3200000, 25, 1)
    makanan indomie = new makanan("Indomie Goreng",3500, 100, "1939-03-29", "Mie");
    makanan roti = new makanan("Roti Tawar", 8000, 50, "2026-04-30", "Roti");

    //-overriding- satu nama method untuk semua
    System.out.println("=== Daftar Produk ===");
    laptop.tampilInfo(); //for elektronik
    hp.tampilInfo(); //for elektronik
    indomie.tampilInfo(); // for makanan
    roti.tampilInfo(); //for makanan
    roti.tampilInfo(); //for makanan

    //-overloading hitungPajak()-
    System.out.println("=== Rincian Pajak Elektronik");

    //1 - pajak standar
    double pajakLaptop = laptop.hitungPajak(1);
    double totalLaptop = laptop.hitungHargaSetelahPajak(1);
    System.out.println("Laptop x1 (PPN Standar 11%)");
    System.out.println("Subtotal    : Rp." + laptop.hitungHargaSetelahPajak(1));
    System.out.println("Pajak   : Rp." + pajakLaptop);
    System.out.println("Total   : Rp." + totalLaptop);

    //2 - pajak custom 5%
    double pajakHpCustom = hp.hitungPajak(2);
    System.out.println("HP Samsung x2 (pajak custom 5%)");
    System.out.println("Subtotal    : Rp." + laptop.hitungTotalHarga(1));
    System.out.println("Pajak   : Rp." + pajakHpCustom);
    System.out.println("Total   : Rp." + hp.hitungTotalHarga(2)+pajakHpCustom);
        
  
        
    }
    
}
