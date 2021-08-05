public class PC {
    private static final double PRECIO_BASE = 1500000;
    private static final double PRECIO_MOUSE = 60000;
    private static final double PRECIO_HEADPHONE = 110000;

    private double precioBase;
    private double mouse;
    private double headphone;
    
    public PC() {
        this.precioBase = PRECIO_BASE;
        this.mouse = PRECIO_MOUSE;
        this.headphone = PRECIO_HEADPHONE;
    }

    public PC(Double precioBase, Double mouse, Double headphone) {
        this.precioBase = precioBase;
        this.mouse = mouse;
        this.headphone = headphone;
    }

    public double calcularPrecio() {
        Double precioFinal;

        precioFinal = precioBase+mouse+headphone;
        return precioFinal;
    }
    

    
    
    

    
}
