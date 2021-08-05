public class PCDesktop extends Computador {

    public final static int KEYBOARD = 160000;
    public final static int CAMERA = 80000;

    public int keyboard;
    public int camera;
    
    public PCDesktop() {
        super();
        this.keyboard = KEYBOARD;
        this.camera = CAMERA;
    }
    
    public PCDesktop(int camera) {
        this.keyboard = KEYBOARD;
        this.camera = camera;
    }

    public PCDesktop(double precioBase, double mouse, double headphone) {
        super(precioBase, mouse, headphone);
        this.keyboard = KEYBOARD;
        this.camera = CAMERA;
    }

    public PCDesktop(int keyboard, int camera) {
        this.keyboard = keyboard;
        this.camera = camera;
    }
    @Override
    public double calcularPrecio() {
        
        return super.calcularPrecio() + keyboard + camera;

    }

    
    
}
