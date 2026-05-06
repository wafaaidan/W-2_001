

public class makanan extends Produk {
    private int expired;
    public makanan(String nama, double harga, int stok, String Kategori, int expired) {
        super(nama, harga, stok, Kategori);
        this.expired = expired;
    }
    // @Override
    //abstrak + override adalah untuk bentuk yang berbeda dengan wajib menerapkan menggunakan method
    public void tampilInfo(){
        System.out.println("Makanan");
        System.out.println("Produk  : " + getnama());
        System.out.println("Kategori: " + Kategori);
        System.out.println("Harga   : " + getharga());
        System.out.println("Stok    : " + getstok());
        System.out.println("---------------------");
        System.out.println("Masa Expired:" + expired + "hari");
    }
    public void setExpired(int expired){
        if(expired < 0) {
            System.out.println("Masa Expired tidak boleh kurang dari 0");
        } else{
            this.expired = expired;
        }
    }
    public void setExpired(int expired, String type){
        if(type.equals("Nasi")){
            if(expired > 4){
                System.out.println("Sudah expired");
            } else{
                if(expired < 2) {
                    System.out.println("Masa expired terlalu kecil");
                }
            }
        }
    }
    @Override
    public double hitungPajak(double harga){
        return harga=0.02;

    }
}
