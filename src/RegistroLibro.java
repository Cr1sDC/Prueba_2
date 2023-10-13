
import java.util.ArrayList;

/**
 *
 * @author cristian abusleme
 */
public class RegistroLibro  {
    
    ArrayList<Libro> listalibros;

    public RegistroLibro() {
        listalibros = new ArrayList<>();
    }
    
    public boolean agregar(Libro libro){
          return listalibros.add(libro);    
    }
    
    public void listar(){
        System.out.println(listalibros);
    }
    
    public boolean eliminar(Libro libro){
        return listalibros.remove(libro);
    }
    
    public boolean verificarlibro(Libro libro){
        if (listalibros.equals(libro)) {
            System.out.println("ES VALIDO");
            return true;
        } else {
            System.out.println("NO ES VALIDO");
            return false;
        }
    }
    
    public boolean cantidadLibrosCaros(int precio){
        int cantidad=0;
        if (precio>30000) {
           cantidad=cantidad+1; 
        }else{
            
        }
    return cantidadLibrosCaros(cantidad);
    }
    
    
    
       
           
        
    
    
    
    
}
