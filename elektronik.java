public class elektronik extends Produk {
    private int garansi;
    public elektronik(String nama, double harga, int stok, String Kategori, int garansi) {
        super(nama, harga, stok, Kategori);
        this.garansi = garansi;
    }
    @Override
    public void tampilInfo(){
        System.out.println("Elektronik");
        // super.tampilInfo();
        System.out.println("Produk  : " + getnama());
        System.out.println("Kategori: " + Kategori);
        System.out.println("Harga   : " + getharga());
        System.out.println("Stok    : " + getstok());
        System.out.println("---------------------");
        System.out.println("Masa Expire Garansi:" + garansi + "tahun");
    }
    public void setGaransi(int garansi){
        if(garansi <= 0) {
            System.out.println("Masa Expired Garansi tidak boleh kurang dari 0");
        } else{
            this.garansi = garansi;
        }
    }
    
    @Override
    public double hitungPajak(double harga){
        return harga=0.20;
    }
}

