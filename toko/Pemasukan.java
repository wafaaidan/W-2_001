package toko;

import base.Produk;

class Pemasukan extends Produk {
    private double totalPemasukan;

    public Pemasukan(String nama, double harga, int stok, String Kategori) {
        super(nama, harga, stok, Kategori);
        this.totalPemasukan = 0;
    }
    void tambahPemasukan(int jumlah) {
        if (jumlah <= stok) {
            totalPemasukan += jumlah * harga;
            stok -= jumlah;

        } else {
            System.out.println("Stok tidak cukup!");
        }
    }
}
