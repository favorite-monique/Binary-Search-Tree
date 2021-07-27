/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinTree;

/**
 *
 * @author 44773
 * @param <E>
 */
public class Node<E> {
    /**
     * This is the data we want to store,
     * It can be of any type
     */
    public E nodeData;   // Data we want to store (could be int, string, Object etc)
    /**
     * This will hold the pointer to the next node in the list
     */
    public Node<E> leftNode;  // A "pointer" to next node in the list
    /**
     * This will hold the pointer to the next node in the list
     */
    public Node<E> rightNode;  // A "pointer" to next node in the list
    
    public Node(){
        this.nodeData = null;
        this.leftNode = null;
        this.rightNode = null;
    }
    
    public Node(E data){
        this.nodeData = data;
        this.leftNode = null;
        this.rightNode = null;
    }
    
    @Override
    public String toString() {
        return nodeData.toString();
    }
}
