package patrones.factory;

class ItemEstandar extends patrones.interfaces.Item{
    
    @Override
    public void consultarRobustes(){
        System.out.println("Soy item Estandar");
    }
}