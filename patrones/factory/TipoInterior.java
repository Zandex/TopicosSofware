package patrones.factory;

class TipoInterior extends patrones.interfaces.TipoItem{
    
    @Override
    public void validarOrigen(){
        System.out.println("Hola soy un ubjeto Interior ");
    }
}