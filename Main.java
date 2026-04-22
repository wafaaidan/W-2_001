public class Main {
    public static void main(String[] args) {
        Produk p = new Produk("Ninjago", 15.0, 75, "lego");

        System.out.println(p.getnama());
        System.out.println(p.getharga());

        p.setHarga(49.75);
        System.out.println(p.getharga());
    }
    
}
