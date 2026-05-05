

public class makanan extends Produk {
    private int expired;
    public makanan(String nama, double harga, int stok, int expired) {
        super(nama, harga, stok, nama);
        this.expired = expired;
    }
    public void tampilData(){
        super.tampilInfo();
        System.out.println("Masa Expired:" + expired + "hari");
    }
    public void setExpired(int expired){
        if(expired < 0) {
            System.out.println("Masa Expired tidak boleh kurang dari 0");
        } else{
            this.expired = expired;
        }
    }
}
