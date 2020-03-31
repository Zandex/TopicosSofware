package patrones.dao;

public interface TipoItemDao{
    
    void addTipoItem(patrones.interfaces.TipoItem tipoItem);
    void printTipoItem();
    void delTipoItem(int idTipoItem);
    void updateTipoItem(int idTipoItem, patrones.interfaces.TipoItem tipoItem);
}