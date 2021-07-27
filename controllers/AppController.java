/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.WorldCitiesSunriseSunsetDAO;
import helpers.InputHelper;
import java.util.logging.Logger;
import model.WorldCitiesSunriseSunset;
import repositories.Repository;

/**
 *
 * @author 44773
 */
public abstract class AppController {
    private static final Logger LOG = Logger.getLogger(AppController.class.getName());
    private Repository<WorldCitiesSunriseSunset> myWorldCitiesSunriseSunset = null;
    private WorldCitiesSunriseSunsetDAO<WorldCitiesSunriseSunset> myStockDAO= null;
    private BinarySearchTree<WorldCitiesSunriseSunset> masterStock = null;
    InputHelper inputHelper = new InputHelper();
    
    /**
     *
     */
    public void run(){
        myWorldCitiesSunriseSunset = new Repository<>();
        myStockDAO = new WorldCitiesSunriseSunsetDAO<>();
        masterStock = new BinarySearchTree<>();

        // InputHelper inputHelper = new InputHelper();
        int iChoice = 0;
        boolean allDone = false;

        do {
            theMenu();
            iChoice = inputHelper.readInt("Enter choice", 8,1);
            switch (iChoice) {
                case 1:
                    System.out.println("Now Reading transactions from file");
                    System.out.println("----------------------------------");
                    loadTransactions();
                    System.out.println(masterStock.toString());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Preorder BST Display");
                    System.out.println("--------------------");
                    displayPreorder();
                    System.out.println(); 
                    break;
                case 3:
                    System.out.println("Inorder BST Display");
                    System.out.println("-------------------");
                    displayInorder();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Postorder BST Display");
                    System.out.println("---------------------");
                    displayPostorder();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Add item to the BST");
                    System.out.println("-------------------");
                    addItem();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Find item in the BST");
                    System.out.println("--------------------");
                    findItem();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Remove item from the BST");
                    System.out.println("------------------------");
                    deleteItem();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("All done! Bye ...");
                    allDone = true;
                    break;
                default: // invalid option
                    System.out.println("Oops! Something has went wrong!");
                    break;
            }
        }while(!allDone);      
    }
    private void theMenu() {
        // Print menu to console  
        System.out.println("Stock Transaction Processing Menu");
        System.out.println(String.format("%s", "_".repeat(33)));
        System.out.println("1: Read transactions from file");
        System.out.println("2: Preorder BST Display");
        System.out.println("3: Inorder BST Display");
        System.out.println("4: Postorder BST Display");
        System.out.println("5: Add item to BST");
        System.out.println("6: Find item in BST");
        System.out.println("7: Remove item from BST");
        System.out.println("8: Exit");
        System.out.println();
    }
    private void loadTransactions() {
        System.out.println("Loading Transactions");
        System.out.println("--------------------");   
        masterStock = myWorldCitiesSunriseSunsetDAO.getWorldCitiesSunriseSunset();
        
        if (!masterStock.isEmpty()) {
            System.out.println("Stock Master loaded into BST.");
        } else {
            System.out.println("Transactions Not Found");
        }
    }     
   
    private void displayPreorder() {
        System.out.println("BST Preorder");
        System.out.println("------------");
        System.out.println(masterStock.preorderTraversal());
    } 
    
    private void displayInorder() {
        System.out.println("BST Inorder");
        System.out.println("-----------");
        System.out.println(masterStock.inorderTraversal());
       
    }
    
    private void displayPostorder() {
        System.out.println("BST Postorder");
        System.out.println("-------------");
        System.out.println(masterStock.postorderTraversal());
    }

    private void addItem() {
        System.out.println("Add item details");
        System.out.println("----------------");
        String City = inputHelper.readString("Please enter the City name");
        String Country = inputHelper.readString("Please enter Country name");
        long Sunrise = inputHelper.readInt("Please enter the Sunrise");
        long Sunset = inputHelper.readInt("Please enter the Stock Sunset");
        
        WorldCitiesSunriseSunset newStockItem = new WorldCitiesSunriseSunset(City, Country, Sunrise, Sunset);
        masterStock.addNode(newStockItem);
        System.out.println(String.format("Item %s has been added.", newStockItem.toString()));
    }
    
    private void findItem() {
        System.out.println("Find item details");
        System.out.println("-----------------");
        String City = "";
        String Country = "";
        long Sunrise = inputHelper.readInt("Please enter the city sunrise time");
        long Sunset = inputHelper.readInt("Please enter the city sunset time");
        
        WorldCitiesSunriseSunset newStockItem = new WorldCitiesSunriseSunset(City, Country, Sunrise, Sunset);
        newStockItem = masterStock.findItem(newStockItem);  
        if(newStockItem != null)
        {
            System.out.println(String.format("Item %s has been found.", newStockItem.toString()));
        }
        else {
            System.out.println("Sorry, this item was not found");
        }
    }
    
    private void deleteItem() {
        System.out.println("Remove item details");
        System.out.println("-------------------");
        String City = "";
        String Country = "";
        long Sunrise = inputHelper.readInt("Please enter the city sunrise time");
        long Sunset = inputHelper.readInt("Please enter the city sunset time");
        
        WorldCitiesSunriseSunset newStockItem = new WorldCitiesSunriseSunset(City, Country, Sunrise, Sunset);
        //newStockItem = masterStock.findItem(newStockItem);  
        if(masterStock.removeNode(newStockItem))
        {
            System.out.println(String.format("Item %s has been removed.", newStockItem.toString()));
        }
        else {
            System.out.println("Sorry, this item was not found");
        }
    }

    private static class BinarySearchTree<T> {

        BinarySearchTree() {
        }

        private boolean isEmpty() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean preorderTraversal() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean inorderTraversal() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean postorderTraversal() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void addNode(WorldCitiesSunriseSunset newStockItem) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private WorldCitiesSunriseSunset findItem(WorldCitiesSunriseSunset newStockItem) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean removeNode(WorldCitiesSunriseSunset newStockItem) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class myWorldCitiesSunriseSunsetDAO {

        private static BinarySearchTree<WorldCitiesSunriseSunset> getWorldCitiesSunriseSunset() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        myWorldCitiesSunriseSunsetDAO() {
        }
    }
    
}

