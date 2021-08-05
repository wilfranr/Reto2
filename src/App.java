public class App {
    public static void main(String[] args) throws Exception {
        PC pcs2[] = new PC[1];
        pcs2[0] = new PCLaptop();
        PrecioTotal precioT2 = new PrecioTotal(pcs2);
        precioT2.mostrarTotales();

    }
}
