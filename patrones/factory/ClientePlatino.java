package patrones.factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author demin
 */
class ClientePlatino extends patrones.interfaces.Cliente{

    @Override
    public void saludar(){
        System.out.println("Hola soy Cliente Platino");
    }
    
}
