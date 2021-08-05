public class App {
    public static void main(String[] args) throws Exception {
        PC pcs4[] = new PC[4];
        pcs4[0] = new PCLaptop(130000);
        pcs4[1] = new PCDesktop(55000);
        pcs4[2] = new PCLaptop(106000, 65000);
        pcs4[3] = new PCDesktop(68000, 180000);
        PrecioTotal precioT4 = new PrecioTotal(pcs4);
        precioT4.mostrarTotales();

    }
}
