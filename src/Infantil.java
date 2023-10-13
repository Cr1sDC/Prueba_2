
import java.util.Scanner;


/**
 *
 * @author cristian abusleme
 */
public class Infantil extends Libro implements ICalculable {
    private int rangoEdadMin,rangoEdadMax;

    public Infantil() {
        super();
    }

    public Infantil(int rangoEdadMin, int rangoEdadMax, String titulo, int numeroPaginas, int precio) {
        super(titulo, numeroPaginas, precio);
        this.rangoEdadMin = rangoEdadMin;
        this.rangoEdadMax = rangoEdadMax;
    }

    

    

    

    public int getRangoEdadMin() {
        return rangoEdadMin;
    }

    public void setRangoEdadMin(int rangoEdadMin) {
        this.rangoEdadMin = rangoEdadMin;
    }

    public int getRangoEdadMax() {
        return rangoEdadMax;
    }

    public void setRangoEdadMax(int rangoEdadMax) {
        this.rangoEdadMax = rangoEdadMax;
    }

    @Override
    public String toString() {
        return "Infantil{" + "rangoEdadMin=" + rangoEdadMin + ", rangoEdadMax=" + rangoEdadMax + super.toString();
    }

    @Override
    public void descripcionCompra() {
        System.out.println("INFANTIL: "+super.getTitulo()+","+super.getPrecio()+"Para Menores entre "+this.getRangoEdadMin()+"y"+this.getRangoEdadMax());
    }

    @Override
    public void obtenerTotalCompra() {
        int cantidad=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de libros:");
        cantidad=leer.nextInt();
        int total= super.getPrecio()*cantidad;
        System.out.println("Total: "+total);
    }

    @Override
    public void descontar() {
        
    }

    @Override
    public void obtenerTotalFinal() {
       
    }
    
    
    
    
}
