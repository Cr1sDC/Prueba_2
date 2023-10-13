/**
 *
 * @author cristian abusleme
 */
public abstract class Libro {
    protected String titulo;
    protected int numeroPaginas,precio;

    public Libro() {
    }

    public Libro(String titulo, int numeroPaginas, int precio) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
    }

    

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

   
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + ", precio=" + precio + '}';
    }
    
    public abstract void descripcionCompra();
    
    
    
}
