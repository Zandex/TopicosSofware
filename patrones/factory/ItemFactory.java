package patrones.factory;

public class ItemFactory extends AbstractFactory{
    
    @Override
    public patrones.interfaces.Item getItem(String itemType){
        if(itemType.equalsIgnoreCase("itemDelicado")){
            return new ItemDelicado();
        }else if (itemType.equalsIgnoreCase("itemRobusto")){
            return new ItemRobusto();
        }else if (itemType.equalsIgnoreCase("itemEstandar")){
            return new ItemEstandar();
        }

        System.out.println("No se encuentra el objeto a fabricar");
        return null;
    }
}