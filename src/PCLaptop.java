public class PCLaptop extends PC {

    private static final Integer EXTRA_BATTERY = 100000;
    private static final Integer EXTRA_CHARGE = 80000;

    private Integer extraBattery;
    private Integer extraCharge;
    
    public PCLaptop(int i, int j) {
        super();
        this.extraBattery = EXTRA_BATTERY;
        this.extraCharge = EXTRA_CHARGE;
    }
    public PCLaptop(Double precioBase, Double mouse, Double headphone) {
        super(precioBase, mouse, headphone);
        this.extraBattery = EXTRA_BATTERY;
        this.extraCharge = EXTRA_CHARGE;
    }

    public PCLaptop(int i) {
    }
    public double calcularPrecio() {
        double precioBase = 0;
        Integer extraBattery = 0;
        Integer extraCharge = 0;

        double precioFinal = precioBase+extraBattery+extraCharge;
        return precioFinal;
    }

    
    
}

