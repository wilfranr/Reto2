public class PC {
    private static final Double PRECIO_BASE = 1850000.0;
    private static final Double PRECIO_MOUSE = 0.0;
    private static final Double PRECIO_HEADPHONE = 0.0;

    private Double precioBase;
    private Double mouse;
    private Double headphone;
    
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
