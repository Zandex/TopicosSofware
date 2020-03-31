/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;
import patrones.dao.ClienteDaoImpl;
import patrones.dao.FacturaDaoImpl;
import patrones.dao.ItemDaoImpl;
import patrones.dao.TipoItemDaoImpl;
/**
 *
 * @author demin
 */
public class Dba {
    
    private static Dba instance;
    
    private Dba(){}
    
    private ClienteDaoImpl clienttable;
    private FacturaDaoImpl facturatable;
    private ItemDaoImpl itemtable;
    private TipoItemDaoImpl tipotable;
    
    public static Dba getInstance(){
        if (instance==null) {
            instance=new Dba();
            instance.buildtables();
            System.out.println("DBA CREADA");
        }
      return instance;
   }
    
    private void buildtables(){
        clienttable=new ClienteDaoImpl();
        facturatable=new FacturaDaoImpl();
        itemtable=new ItemDaoImpl();
        tipotable=new TipoItemDaoImpl();
    }
    
    public ClienteDaoImpl getClienttable() {
        return clienttable;
    }

    public FacturaDaoImpl getFacturatable() {
        return facturatable;
    }

    public ItemDaoImpl getItemtable() {
        return itemtable;
    }

    public TipoItemDaoImpl getTipoItemtable() {
        return tipotable;
    }
    
    
}
