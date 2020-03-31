package patrones.dao;

/*package com.journaldev.dao;

import com.journaldev.model.Books;*/

import java.util.List;

public interface ItemDao {

    public void addItem(patrones.interfaces.Item items);

    public void printItem();

    public void delItem(int idItem);

    public void updateItem(int idItem, patrones.interfaces.Item items);
}