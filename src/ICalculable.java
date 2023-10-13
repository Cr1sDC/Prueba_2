/**
 *
 * @author cristian abusleme
 */
public interface ICalculable {
    public static final double iva=0.19;
    final double descuentoLibroInfantil=0.10;
    final double descuentoLibroTecnico =0.05;
    void obtenerTotalCompra();
    void descontar();
    void obtenerTotalFinal();
}
