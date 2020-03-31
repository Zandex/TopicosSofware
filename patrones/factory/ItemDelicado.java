package patrones.factory;

class ItemDelicado extends patrones.interfaces.Item {

    @Override
    public void consultarRobustes(){
        System.out.println("Soy item Delicado");
    }
}