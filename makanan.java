

public class makanan extends Produk {
    private String kedaluwarsa;
    private String Kategori;
    public makanan(String nama, double harga, int stok, String kedaluwarsa, String Kategori) {
        super(nama, harga, stok);
        this.kedaluwarsa = kedaluwarsa;
        this.Kategori = Kategori;
    }   

    //membuat getter dan setter
    public String getKedaluwarsa() {
        return kedaluwarsa;
    }

    public String getKategori() {
        return Kategori;
    }
    @Override
    //abstrak + override adalah untuk bentuk yang berbeda dengan wajib menerapkan menggunakan method
    public void tampilInfo(){
        System.out.println("[Makanan]");
        System.out.println("Kategori: " + Kategori);
        System.out.println("Kedaluwarsa : " + kedaluwarsa);
        System.out.println("---------------------");
    }
    //Overloading hitungDiskon()
    //1 - Diskon otomatis jika beli  >= 10
    public double hitungDiskon(int jumlahBeli) {
        if (jumlahBeli >= 10) 
            return hitungTotalHarga(jumlahBeli) * 0.05;
            return 0; 
    }

    //2 - diskon custom
    public double hitungDiskon(int jumlahBeli, double persenDiskon) {
        return hitungTotalHarga(jumlahBeli) * (persenDiskon / 100);
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) - hitungDiskon(jumlahBeli);
    }
    
    @Override
    public double hitungPajak(double harga){
        return harga=0.10;

    }
}
