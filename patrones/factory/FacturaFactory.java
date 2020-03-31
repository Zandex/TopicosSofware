/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.factory;
/**
 *
 * @author demin
 */
public class FacturaFactory extends AbstractFactory {
    
    
    @Override
    public patrones.interfaces.Factura getFactura(String facturaType){
        if(facturaType.equalsIgnoreCase("facturaVencida")){
            return new FacturaVencida();
        }else if (facturaType.equalsIgnoreCase("facturaPagada")){
            return new FacturaPagada();
        }else if (facturaType.equalsIgnoreCase("facturaPromocion")){
            return new FacturaPagada();
        }

        System.out.println("No se encuentra el objeto a fabricar");
        return null;
    }
}