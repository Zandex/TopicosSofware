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
public class ClienteFactory  extends AbstractFactory {
    @Override
    public patrones.interfaces.Cliente getCliente(String clienteType){
        if(clienteType.equalsIgnoreCase("clienteEstandar")){
            return new ClienteEstandar();
        }else if (clienteType.equalsIgnoreCase("clientePlatino")){
            return new ClientePlatino();
        }else if (clienteType.equalsIgnoreCase("clientePremium")){
            return new ClientePremium();
        }
        
        System.out.println("No se encuentra el cliente a fabricar");
        return null;
    }    
}