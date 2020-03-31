package patrones.dao;

import java.util.List;

public interface FacturaDao {

    public void addFactura(patrones.interfaces.Factura factura);

    public void printFacturas();

    public void delFactura(int nroFactura);

    public void updateFactura(int nroFactura, patrones.interfaces.Factura factura);
}