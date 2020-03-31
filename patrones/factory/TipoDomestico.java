package patrones.factory;

class TipoDomestico extends patrones.interfaces.TipoItem{
    
    @Override
    public void validarOrigen(){
        System.out.println("Hola soy un ubjeto Domestico ");
    }
}