

public class Produk {
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
    
    public void tampilInfo() {
        System.out.println("Produk  : " + nama);
        System.out.println("Kategori: " + Kategori);
        System.out.println("Harga   : " + harga);
        System.out.println("Stok    : " + stok);
        System.out.println("---------------------");
    }
}
