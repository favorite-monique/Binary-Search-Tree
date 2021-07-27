/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author 44773
 * @param <E>
 */
public interface IBSearchTree<E extends Comparable<E>> {
    void addNode(E theItem);
    boolean nodeContains(E desiredItem);
    E findItem(E desiredItem);
    E deleteNode(E desiredItem);
    boolean removeNode(E desiredItem);
}

