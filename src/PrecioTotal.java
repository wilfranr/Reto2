
public class PrecioTotal {

    //Atributos
    private double totalComputadores;
    private double totalLaptops;
    private double totalDesktops;
    
    //Lista de Computadors
    public Computador[] computadores;

    public PrecioTotal(Computador[] computadores) {
        this.computadores = computadores;
        this.totalComputadores = 0;
        this.totalLaptops = 0;
        this.totalDesktops = 0;

    }

    //Constructores
    public PrecioTotal () {
        this.totalComputadores = 0;
        this.totalLaptops = 0;
        this.totalDesktops = 0;
    }


    //Metodos
    public void mostrarTotales() {
        
        this.totalComputadores = 0;
        this.totalLaptops = 0;
        this.totalDesktops = 0;
    

        for (Computador i: computadores){
            if (i instanceof Computador) {
                totalComputadores += i.calcularPrecio();
            }
            if (i instanceof PCLaptop) {
                totalLaptops += i.calcularPrecio();
            }
            if (i instanceof PCDesktop) {
                totalDesktops += i.calcularPrecio();
            }
            
        }
        System.out.println("El precio total de los computadores es de "+Math.round(totalComputadores));
        System.out.println("La suma del precio de los Laptops es de "+Math.round(totalLaptops));
        System.out.println("La suma del precio de los Desktops es de "+Math.round(totalDesktops));
    }
    
}