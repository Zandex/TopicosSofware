package patrones.dao;

import java.util.ArrayList;
import patrones.interfaces.TipoItem;
public class TipoItemDaoImpl implements TipoItemDao{


    public ArrayList <TipoItem> tipoItems;

    public TipoItemDaoImpl(){
        tipoItems = new ArrayList<>();
    }

    @Override
    public void addTipoItem(TipoItem tipoItem){
        tipoItems.add(tipoItem);
    }

    @Override
    public void printTipoItem(){
        for(TipoItem tipoItem :  tipoItems){
            System.out.println(tipoItem.printInfo());
        }
    }

    @Override
    public void delTipoItem(int idTipoInfo){
        int index = 0;

        for(TipoItem tipoItem: tipoItems){
            if(tipoItem.getIdDescription() == idTipoInfo){
                break;
            }

            index++;
        }
        tipoItems.remove(index);
    }

    @Override
    public void updateTipoItem(int idTipoItem, TipoItem newTipoItem){
        int index = 0;

        for(TipoItem tipoItem: tipoItems){
            if(tipoItem.getIdDescription() == idTipoItem){
                tipoItems.set(index, newTipoItem);
            }
            index++;
        }
    }
/*
    @Override
    public void addTipoItem(TipoItem tipoItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTipoItem(int idTipoItem, TipoItem tipoItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}