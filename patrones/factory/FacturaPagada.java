package patrones.factory;


class FacturaPagada extends patrones.interfaces.Factura {
    
    @Override
    public void validarEstado(){
        System.out.println("Su factura ha sido cancelada");
    }
}