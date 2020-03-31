package patrones.dao;

import java.util.ArrayList;
import java.util.List;
import patrones.interfaces.Factura;


public class FacturaDaoImpl implements FacturaDao {

    //list is working as a database
    public ArrayList<Factura> facturas;

    public FacturaDaoImpl() {
        facturas = new ArrayList<>();
    }

    @Override
    public void addFactura(Factura factura){
        facturas.add(factura);
    }

    @Override
    public void printFacturas(){
        for(Factura factura: facturas){
            System.out.println(factura.printInfo());
        }
    }

    @Override
    public void delFactura(int nroFactura){
        int index = 0;

        for(Factura factura: facturas){

            if( factura.getNroFactura() == nroFactura ){
                break;
            }

            index++;
        }
        facturas.remove(index);
    }

    @Override
    public void updateFactura(int nroFactura, Factura newFactura){
        int index = 0;

        for(Factura factura: facturas){

            if( factura.getNroFactura() == nroFactura ){
                facturas.set(index, newFactura);
            }

            index++;
        }
    }
/*
    @Override
    public void addFactura(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateFactura(int nroFactura, Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
}