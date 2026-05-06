

abstract class Produk {
    private String nama;
    private double harga;
    private int stok;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        
    }
    //getter setter
    public String getnama() { return nama; }
    public double getharga() { return harga; }
    public int getstok() { return stok; }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    public double hitungTotalHarga(int jumlahBeli){
        return harga * jumlahBeli;

    }
    public void beli(int jumlahBeli){
        if(jumlahBeli <= 0) {
            System.out.println("Jumlah beli harus lebih dari 0");
            return;

        }
        if (jumlahBeli > stok) {
            System.out.println(("Stok" + nama + "tidak cukup, tersisa " + stok));
            return;
        }
        stok -= jumlahBeli;
        System.out.println("Beli" + nama + "x"+ jumlahBeli + " = Rp." + hitungTotalHarga(jumlahBeli) + " | Sisa stok: " + stok);
    }   


    public abstract void tampilInfo();

    public abstract double hitungPajak(double harga);
        
    
}
