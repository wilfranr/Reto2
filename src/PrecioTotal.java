
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
    
}