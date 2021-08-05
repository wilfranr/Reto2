public class PCLaptop extends PC {

    public final static int EXTRA_BATERY = 100000;
    public final static int EXTRA_CHARGER = 80000;

    public int extraBatery;
    public int extraCharger;

    public PCLaptop() {
        super();
        this.extraBatery = EXTRA_BATERY;
        this.extraCharger = EXTRA_CHARGER;
    }

    public PCLaptop(int extraBatery) {
        this.extraCharger = EXTRA_CHARGER;
        this.extraBatery = extraBatery;
    }

    public PCLaptop(int extraBatery, int extraCharger) {
        this.extraBatery = extraBatery;
        this.extraCharger = extraCharger;
    }

    public PCLaptop(double precioBase, double headphone, int extraBatery, int extraCharger) {
        super(precioBase, headphone);
        this.extraBatery = extraBatery;
        this.extraCharger = extraCharger;
    }

    public PCLaptop(double precioBase, double mouse, double headphone) {
        super(precioBase, mouse, headphone);
    }

    public PCLaptop(double precioBase, double mouse, double headphone, int extraBatery, int extraCharger) {
        super(precioBase, mouse, headphone);
        this.extraBatery = extraBatery;
        this.extraCharger = extraCharger;
    }
    @Override
    public double calcularPrecio() {
        
        return super.calcularPrecio() + extraBatery + extraCharger;

    }
    

}
