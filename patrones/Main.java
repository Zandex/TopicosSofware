/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author demin
 */
public class Main {
    public Main(){}
    
    public static void main(String args[]) {
        Dba db=Dba.getInstance();
        Factory fc=Factory.getInstance();
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Icliente(db,fc).setVisible(true);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Itipo_item(db,fc).setVisible(true);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iitem(db,fc).setVisible(true);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ifactura(db,fc).setVisible(true);
            }
        });
    }
}
