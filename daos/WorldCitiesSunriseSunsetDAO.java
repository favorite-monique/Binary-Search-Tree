/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import BinarySearchTree.BinarySearchTree;
import controllers.AppController;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.WorldCitiesSunriseSunset;

/**
 *
 * @author 44773
 * @param <E>
 */
public abstract class WorldCitiesSunriseSunsetDAO<E extends Comparable<E>> extends DAO<E> {
    public static final char DELIMITER = ',';
    public static final char EOLN='\n';       
    public static final String QUOTE="\""; 
    public static final String USERDIRECTORY = System.getProperty("user.dir");
    private static final Logger LOG = Logger.getLogger(WorldCitiesSunriseSunsetDAO.class.getName());

    private String stripQuotes(String str) {
        return str.substring(1, str.length()-1);
    }        

    @SuppressWarnings("unchecked")
    public BinarySearchTree<E> getWorldCitiesSunriseSunset() {
        BinarySearchTree<E> dataBST = new BinarySearchTree<>();
        String transactionFile = USERDIRECTORY +"\\wcss.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(transactionFile))) { 
            String city;
            String country;
            int sunrise;
            int sunset;

            String[] temp;
            String line = br.readLine();
            while(line!=null){
                temp=line.split(Character.toString(DELIMITER));        
                city = temp[0];
                country = temp[1];
                sunrise = Integer.parseInt(temp[2]); 
                sunset = Integer.parseInt(temp[3]);
                WorldCitiesSunriseSunset theStock = new WorldCitiesSunriseSunset(city, country, sunrise, sunset); 
                dataBST.addNode((E)theStock);  
                line = br.readLine();                
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(AppController.class.getName()).log(Level.INFO, null, ex);
        }         
        return dataBST;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List<E> getItems() {
        List<E> dataList = new ArrayList<>();
        String transactionFile = USERDIRECTORY +"\\wcss.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(transactionFile))) { 
            String city;
            String country;
            long sunrise;
            long sunset;

            String[] temp;
            String line = br.readLine();
            while(line!=null){
                temp=line.split(Character.toString(DELIMITER));        
                city = temp[0];
                country = temp[1];
                sunrise = Integer.parseInt(temp[2]); 
                sunset = Integer.parseInt(temp[3]);
                WorldCitiesSunriseSunset theStock = new WorldCitiesSunriseSunset(city, country, sunrise, sunset); 
                dataList.add((E) theStock);  
                line = br.readLine();                
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(AppController.class.getName()).log(Level.INFO, null, ex);
        }         
        return dataList;
    }
    
    @Override
    public void add(E itemToAdd) {
        String transactionFile = USERDIRECTORY +"\\wcssU.txt";        
        try (BufferedWriter output = new BufferedWriter(new FileWriter(transactionFile, true))) {        
            output.write(itemToAdd.toString());
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(AppController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }    
    @Override
    public void storeData(List<E> data){
        String transactionFile = USERDIRECTORY +"\\wcssU.txt";        
        try (BufferedWriter output = new BufferedWriter(new FileWriter(transactionFile, false))) {
            for (E item : data){
                output.write(item.toString()+"\n");
            }
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(AppController.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }
    
    public void update(String city, int itemValue){
        System.out.println("Not implemented");
    }
    public void remove(String city){
        System.out.println("Not implemented");
    }

}

