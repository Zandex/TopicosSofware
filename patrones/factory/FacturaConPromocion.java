package patrones.factory;


class FacturaConPromocion extends patrones.interfaces.Factura {
    
    @Override
    public void validarEstado(){
        System.out.println("Su factura tiene Descuento");
    }
}