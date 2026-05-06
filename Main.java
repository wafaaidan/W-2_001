public class Main {
    public static void main(String[] args) {
        elektronik mesinCuci = new elektronik("sharp", 249.99, 24, "alat rumah tangga", 5 );
        makanan snack = new makanan("Snigger", 0.98, 4550, "Snack", 12);

        mesinCuci.setGaransi(4);
        mesinCuci.tampilInfo();
        snack.setExpired(15);
        snack.tampilInfo();

        
    }
    
}
