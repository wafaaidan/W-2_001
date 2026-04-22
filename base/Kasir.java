package base;

public class Kasir {
    void cekProduk(Produk p) {
        System.out.println(p.stok); //public
        System.out.println(p.harga); //protected, satu package
        System.out.println(p.Kategori); //default, satu package
        // System.out.println(p.nama); //private
    }
}
