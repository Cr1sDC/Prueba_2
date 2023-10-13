/**
 *
 * @author cristian abusleme
 */
public class Tecnico extends Libro implements ICalculable {
    private char IndicadorDisco;

    public Tecnico() {
        super();
    }

    public Tecnico(char IndicadorDisco, String titulo, int numeroPaginas, int precio) {
        super(titulo, numeroPaginas, precio);
        this.IndicadorDisco = IndicadorDisco;
    }

    
    

    

    public char getIndicadorDisco() {
        return IndicadorDisco;
    }

    public void setIndicadorDisco(char IndicadorDisco) {
        this.IndicadorDisco = IndicadorDisco;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "IndicadorDisco=" + IndicadorDisco + super.toString();
    }

    @Override
    public void descripcionCompra() {
        System.out.println("TECNICO: "+super.getTitulo()+","+super.getPrecio());
    }

    @Override
    public void obtenerTotalCompra() {
    }

    @Override
    public void descontar() {
    }

    @Override
    public void obtenerTotalFinal() {
    }
    
    
    
    
}
