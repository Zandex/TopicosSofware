package patrones.factory;

public class TipoItemFactory extends AbstractFactory {
    
    @Override
    public patrones.interfaces.TipoItem getTypeItem(String typeItem ){
        if(typeItem.equalsIgnoreCase("tipoExterior")){
            return new TipoExterior();
        }else if (typeItem.equalsIgnoreCase("tipoInterior")){
            return new TipoInterior();
        }
        else if (typeItem.equalsIgnoreCase("tipoDomestico")){
            return new TipoDomestico();
        }

        System.out.println("No se encuentra el objeto a fabricar");
        return null;
    }
}