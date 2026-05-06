

abstract class Produk {
    private String nama;
    String Kategori;
    private double harga;
    private int stok;

    public Produk(String nama, double harga, int stok, String Kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.Kategori = Kategori;
    }
    public String getnama() { return nama; }
    public double getharga() { return harga; }
    public int getstok() { return stok; }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    public abstract void tampilInfo();

    public abstract double hitungPajak(double harga);
        
    
}
