package patrones.dao;

/*package com.journaldev.dao;

import com.journaldev.model.Books;*/

import java.util.List;

public interface ClienteDao {

    public void addCliente(patrones.interfaces.Cliente cliente);

    public void printClientes();

    public void delCliente(int idCliente);

    public void updateCliente(int idCliente, patrones.interfaces.Cliente cliente);
}