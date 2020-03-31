package patrones.factory;

class ItemRobusto extends patrones.interfaces.Item{
    
    @Override
    public void consultarRobustes(){
        System.out.println("Soy item Fuerte");
    }
}