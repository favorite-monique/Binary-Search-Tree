/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;

/**
 *
 * @author 44773
 */
public abstract class DAO<E> {	
    
    public abstract List<E> getItems();
    public abstract void add(E itemToAdd);
    public abstract void storeData(List<E> data);
    public abstract void update(int itemID, int itemValue);
    public abstract void remove(int itemID);    
}
