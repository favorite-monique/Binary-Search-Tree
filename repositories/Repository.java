/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import daos.DAO;
import daos.WorldCitiesSunriseSunsetDAO;
import java.util.List;

/**
 *
 * @author 44773
 * @param <E>
 */
public class Repository<E> implements RepositoryInterface<E> {
    private DAO dao;
	
    public Repository() { 
        dao = new WorldCitiesSunriseSunsetDAO();     
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List<E> getItems() {       	
        return dao.getItems();
    }   
    
    @Override
    @SuppressWarnings("unchecked")
    public void addItem(E itemToAdd) {
        dao.add(itemToAdd);
    }     
    
    @Override
    public void updateItem(int itemID, int itemQTY) {
        dao.update(itemID, itemQTY);
    }     
    
    @Override
    public void deleteItem(int itemID) {
        dao.remove(itemID);
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public void writeRepo(List<E> dataToStore){
        dao.storeData(dataToStore);
    }
}

