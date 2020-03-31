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
public abstract class AbstractFactory {
    public patrones.interfaces.Cliente getCliente(String ClienteType){
        return null;
    }

    public patrones.interfaces.Factura getFactura(String facturaType){
        return null;
    }

    public patrones.interfaces.Item getItem(String itemType){
        return null;
    }

    public patrones.interfaces.TipoItem getTypeItem(String typeItem ){
        return null;
    }

}
