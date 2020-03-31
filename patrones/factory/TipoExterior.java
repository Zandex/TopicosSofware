package patrones.factory;

class TipoExterior extends patrones.interfaces.TipoItem{
    
    @Override
    public void validarOrigen(){
        System.out.println("Hola soy un ubjeto del Exterior ");
    }
}