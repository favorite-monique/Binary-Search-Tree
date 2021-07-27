/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

import BinTree.Node;
import static java.lang.Math.E;
import java.util.logging.Logger;
import model.WorldCitiesSunriseSunset;

/**
 *
 * @author 44773
 * @param <E>
 */
public abstract class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> implements IBSearchTree<E> {
    private static final Logger LOG = Logger.getLogger(BinarySearchTree.class.getName());
    private BinarySearchTree<E> root;
    // <E extends Comparable<E>>
    @Override
    public void addNode(E theItem){
        root = addNode(root, theItem);
    }
    @SuppressWarnings("unchecked")
    private Node<E> addNode(Node localRoot, E theItem) {
        if (localRoot == null) {
            // item is not in the tree insert it.
            return new Node<>(theItem);
        } else if (theItem.compareTo(localRoot.nodeData) == 0) {
            // item is equal to localRoot.data
            System.out.println("Item already exists in the BST!");
            return localRoot;
        } else if (theItem.compareTo(localRoot.nodeData) < 0) {
            // item is less than localRoot.data
            localRoot.leftNode = addNode(localRoot.leftNode, theItem);
            return localRoot;
        } else {
            // item is greater than localRoot.data
            localRoot.rightNode = addNode(localRoot.rightNode, theItem);
            return localRoot;
        }
    }

    @Override
    public boolean nodeContains(E desiredItem){
        return findItem(desiredItem)!= null;
    }

    @Override
    public E findItem(E desiredItem){
        return findItem(root, desiredItem);
    }
    private E findItem(Node<E> localRoot, E desiredItem) {
        if (localRoot == null) {
            return null;
        }
        // Compare the target with the data field at the root.
        int compResult = desiredItem.compareTo(localRoot.nodeData);
        if (compResult == 0) {
            return localRoot.nodeData;
        } else if (compResult < 0) {
            return findItem(localRoot.leftNode, desiredItem);
        } else {
            return findItem(localRoot.rightNode, desiredItem);
        }
    }

    @Override
    public E deleteNode(E desiredItem){
        BinarySearchTree<E> root = deleteNode(root, desiredItem);
        return desiredItem;
    }
    
    private Node<E> deleteNode(Node<E> localRoot, E desiredItem){
        if (localRoot == null) {
            return localRoot;
        }
        
        int compResult = desiredItem.compareTo(localRoot.nodeData);
        if (compResult < 0) {
            localRoot.leftNode = deleteNode(localRoot.leftNode, desiredItem);
        } else if (compResult > 0) {
            localRoot.rightNode = deleteNode(localRoot.rightNode, desiredItem);
        } else {

            if (localRoot.leftNode == null) {
                return localRoot.rightNode;
            } else if (localRoot.rightNode == null) {
                return localRoot.leftNode;
            }

            localRoot.nodeData = inOrderSuccessor(localRoot.rightNode);
            localRoot.rightNode = deleteNode(localRoot.rightNode, localRoot.nodeData);
        }

        return localRoot;
    }
    private E inOrderSuccessor(Node<E> localRoot) {
        // If the left child has no left child, it is
        // the inorder sucessor.
        if (localRoot.leftNode.leftNode == null) {
            E minimum = localRoot.leftNode.nodeData;
            localRoot.leftNode = localRoot.leftNode.rightNode;
            return minimum;
        }
        return inOrderSuccessor(localRoot.leftNode);
    }
    
    @Override
    public boolean removeNode(E desiredItem){
        return deleteNode(desiredItem) != null;
    }

    public void addNode(WorldCitiesSunriseSunset theStock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

