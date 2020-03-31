package patrones.dao;

import java.util.ArrayList;
import java.util.List;
import patrones.interfaces.Item;


public class ItemDaoImpl implements ItemDao {

    //list is working as a database
    public ArrayList<Item> items;

    public ItemDaoImpl() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public void printItem(){
        System.out.println("numero de elementos: " + items.size());
        for(Item item: items){
            System.out.println(item.printInfo());
        }
    }

    @Override
    public void delItem(int idItem){
        int index = 0;

        for(Item item: items){

            if( item.getId() == idItem ){
                break;
            }

            index++;
        }
        items.remove(index);
    }

    @Override
    public void updateItem(int idItem, Item newItem){
        int index = 0;

        for(Item item: items){

            if( item.getId() == idItem){
                items.set(index, newItem);
            }

            index++;
        }
    }
/*
    @Override
    public void addItem(Item items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateItem(int idItem, Item items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}