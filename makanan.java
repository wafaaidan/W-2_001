

public class makanan extends Produk {
    private int expired;
    public makanan(String nama, double harga, int stok, int expired) {
        super(nama, harga, stok, nama);
        this.expired = expired;
    }
    @Override
    public void tampilInfo(){
        System.out.println("Makanan");
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
}
