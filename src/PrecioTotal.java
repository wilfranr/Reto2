
public class PrecioTotal {

    //Atributos
    private Double totalPCs;
    private Double totalLaptops;
    private Double totalDesktops;
    
    private PC computadores[];

    //Constructores
    public PrecioTotal () {
        this.totalPCs = 0.0;
        this.totalLaptops = 0.0;
        this.totalDesktops = 0.0;
    }

    public PrecioTotal(PC computadores[]) {
        this.totalPCs = 0.0;
        this.totalLaptops = 0.0;
        this.totalDesktops = 0.0;

        this.computadores = computadores;
    }
    //Metodos
    public void mostrarTotales() {
        for (PC el: computadores){
            if (el instanceof PC) {
                totalPCs += el.calcularPrecio();
            }
            if (el instanceof PCLaptops) {
                totalPCs += el.calcularPrecio();
            }
            if (el instanceof PCDesktop) {
                totalPCs += el.calcularPrecio();
            }
        }
    }
    
}