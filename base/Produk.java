package base;

public class Produk {
    private String nama;
    String Kategori;
    protected double harga;
    public int stok;

    public Produk(String nama, double harga, int stok, String Kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.Kategori = Kategori;
    }

    public void tampilInfo() {
        System.out.println("Produk  : " + nama);
        System.out.println("Kategori: " + Kategori);
        System.out.println("Harga   : " + harga);
        System.out.println("Stok    : " + stok);
        System.out.println("---------------------");
    }
}
