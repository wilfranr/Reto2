public class PCDesktop extends PC {

    private static final Integer KEYBOARD = 160000;
    private static final Integer CAMERA = 80000;

    private Integer keyboard;
    private Integer camera;
    
    public PCDesktop(int i, int j) {
        super();
        this.keyboard = KEYBOARD;
        this.camera = CAMERA;
    }
    public PCDesktop(Double precioBase, Double mouse, Double headphone) {
        super(precioBase, mouse, headphone);
        this.keyboard = KEYBOARD;
        this.camera = CAMERA;
    }

    public PCDesktop(int i) {
    }
    public double calcularPrecio() {
        double precioBase = 1850000;
        Integer keyboard = 30000;
        Integer camera = 30000;

        double precioFinal = precioBase+keyboard+camera;
        return precioFinal;
    }

    
    
}
