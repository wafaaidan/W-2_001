public class elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    public elektronik(String nama, String merek, double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }

    public String getMerek(){
        return merek;
    }
    public int getGaransiTahun(){
        return garansiTahun;
    }
    //overriding tampilInfo()
    @Override
    public void tampilInfo(){
        System.out.println("[Elektronik]");
        // super.tampilInfo();
        System.out.println("Nama    : " + getnama());
        System.out.println("Merek   : " + merek);
        System.out.println("Garansi : " + garansiTahun + "tahun");
        System.out.println("---------------------");
    }
    public void setGaransi(int garansiTahun){
        if(garansiTahun <= 0) {
            System.out.println("Masa Expired Garansi tidak boleh kurang dari 0");
        } else{
            this.garansiTahun = garansiTahun;
        }
    }
    
    //Overloading hitungPajak()

    //1 - pajak standar ppn 11%
    public double hitungDiskon(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) * PPN;
    }

    //2 - pajak custom
    public double hitungDiskon(int jumlahBeli, double persenPajak){
        return hitungTotalHarga(jumlahBeli) + hitungPajak(jumlahBeli);
    }
    @Override
    public double hitungPajak(double harga){
        return harga = 0.20;
    }
}

