public class PC {
    // Constantes
    public static final double PRECIO_BASE = 1500000;
    public static final double PRECIO_MOUSE = 60000;
    public static final double PRECIO_HEADPHONE = 110000;

    // Atributos
    public double precioBase;
    public double mouse;
    public double headphone;

    // Constructores
    public PC() {
        this.precioBase = PRECIO_BASE;
        this.mouse = PRECIO_MOUSE;
        this.headphone = PRECIO_HEADPHONE;
    }

    public PC(double precioBase, double headphone) {
        this.mouse = PRECIO_MOUSE;
        this.precioBase = precioBase;
        this.headphone = headphone;
    }

    public PC(double precioBase, double mouse, double headphone) {
        this.precioBase = precioBase;
        this.mouse = mouse;
        this.headphone = headphone;
    }
    

    public double calcularPrecio() {
        double precioFinal;

        return precioFinal = precioBase + mouse + headphone;
    }

}
