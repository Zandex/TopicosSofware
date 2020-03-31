package patrones.factory;


class FacturaVencida extends patrones.interfaces.Factura {
    
    @Override
    public void validarEstado(){
        System.out.println("Su factura no ha sido pagada en el dia");
    }
}