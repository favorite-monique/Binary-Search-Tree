/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import java.util.List;

/**
 *
 * @author 44773
 */
public interface RepositoryInterface<E> {
    List<E> getItems();
    void addItem(E itemToAdd);
    void updateItem(int itemID, int itemQTY);
    void deleteItem(int itemID);
    void writeRepo(List<E> dataToStore);
}
