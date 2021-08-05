
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
            if (el instanceof PCLaptop) {
                totalPCs += el.calcularPrecio();
            }
            if (el instanceof PCDesktop) {
                totalPCs += el.calcularPrecio();
            }
            
        }
        System.out.println("El precio total de los computadores es de "+totalPCs);
        System.out.println("La suma del precio de los PCLaptops es de "+totalLaptops);
        System.out.println("La suma del precio de los PCDesktops es de "+totalDesktops);
    }
    
    
}