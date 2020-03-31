
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
class ClienteEstandar extends patrones.interfaces.Cliente{

    @Override
    public void saludar(){
        System.out.println("Hola soy Cliente Estandar");
    }
    
}
