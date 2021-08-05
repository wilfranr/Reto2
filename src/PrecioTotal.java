
public class PrecioTotal {

    //Atributos
    private double totalPCs;
    private double totalLaptops;
    private double totalDesktops;
    
    //Lista de pcs
    public PC[] computadores;

    public PrecioTotal(PC[] computadores) {
        this.computadores = computadores;
        this.totalPCs = 0;
        this.totalLaptops = 0;
        this.totalDesktops = 0;

    }

    //Constructores
    public PrecioTotal () {
        this.totalPCs = 0;
        this.totalLaptops = 0;
        this.totalDesktops = 0;
    }


    //Metodos
    public void mostrarTotales() {
        
        this.totalPCs = 0;
        this.totalLaptops = 0;
        this.totalDesktops = 0;
    

        for (PC i: computadores){
            if (i instanceof PC) {
                totalPCs += i.calcularPrecio();
            }
            if (i instanceof PCLaptop) {
                totalLaptops += i.calcularPrecio();
            }
            if (i instanceof PCDesktop) {
                totalDesktops += i.calcularPrecio();
            }
            
        }
        System.out.println("El precio total de los computadores es de "+totalPCs);
        System.out.println("La suma del precio de los PCLaptops es de "+totalLaptops);
        System.out.println("La suma del precio de los PCDesktops es de "+totalDesktops);
    }
    
    
}