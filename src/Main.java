
/**
 *
 * @author cristian abusleme
 */
public class Main {
    public static void main(String[] args) {
        
        Infantil inf=new Infantil(3, 9, "Paul y Paula", 70, 9990);
        Tecnico tec=new Tecnico('C', "Aprende Python", 325, 25990);
        
        RegistroLibro reg=new RegistroLibro();
        
        
        reg.agregar(inf);
        reg.agregar(tec);
        
        System.out.println("********Objetos Agregados*****");
        
        reg.verificarlibro(inf);
        reg.verificarlibro(tec);
        
        System.out.println("*****************************");
        
        inf.obtenerTotalFinal();
        
        
        
        reg.eliminar(inf);
        
        System.out.println("***********************************");
        
        
        
    }
}
