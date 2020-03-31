/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.ArrayList;
import patrones.factory.AbstractFactory;
import patrones.factory.FactoryProducer;

import patrones.interfaces.Cliente;
import patrones.interfaces.Factura;
import patrones.interfaces.Item;
import patrones.interfaces.TipoItem;

import patrones.dao.ClienteDaoImpl;
import patrones.dao.FacturaDaoImpl;
import patrones.dao.ItemDaoImpl;
import patrones.dao.TipoItemDaoImpl;

/**
 *
 * @author demin
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    private static Factory instance;
    
    private AbstractFactory fabricaCliente;
    private AbstractFactory fabricaFactura;
    private AbstractFactory fabricaItems;
    private AbstractFactory fabricaTipoItems;
    
    private Factory(){         
    }
    
    public static Factory getInstance(){
        if (instance==null) {
            instance=new Factory();
            instance.buildFactorys();
            System.out.println("Factory CREADA");
        }
      return instance;
   }
    
    private void buildFactorys(){        
        fabricaCliente= FactoryProducer.getFactory("cliente");
        fabricaFactura= FactoryProducer.getFactory("factura");
        fabricaItems= FactoryProducer.getFactory("item");
        fabricaTipoItems= FactoryProducer.getFactory("tipo_factura");
    }

    public AbstractFactory getFabricaCliente() {
        return fabricaCliente;
    }

    public AbstractFactory getFabricaFactura() {
        return fabricaFactura;
    }

    public AbstractFactory getFabricaItems() {
        return fabricaItems;
    }

    public AbstractFactory getFabricaTipoItems() {
        return fabricaTipoItems;
    }
    
    
    
}
