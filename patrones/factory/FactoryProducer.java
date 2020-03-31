/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.factory;

import patrones.factory.AbstractFactory;
import patrones.factory.ClienteFactory;
import patrones.factory.FacturaFactory;
import patrones.factory.ItemFactory;
import patrones.factory.TipoItemFactory;

/**
 *
 * @author demin
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("cliente")){
            System.out.println("-Fabrica cliente construida");
            return new ClienteFactory();
        }else if (factory.equalsIgnoreCase("factura")){
            System.out.println("-Fabrica factura construida");
            return new FacturaFactory();
        }else if (factory.equalsIgnoreCase("item")){
            System.out.println("-Fabrica item construida");
            return new ItemFactory();
        }else if (factory.equalsIgnoreCase("tipo_factura")){
            System.out.println("-Fabrica tipo item construida");
            return new TipoItemFactory();
        }else {
            return null;
        }
   }
}
