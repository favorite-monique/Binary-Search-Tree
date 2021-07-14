/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moniqueproject.computerpionersproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.module.ModuleDescriptor.read;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import static javax.imageio.ImageIO.read;
import javax.xml.crypto.Data;

/**
 *
 * @author 44773
 */
public class ComputingPioneers {
    
    private String firstName;
    private String lastName;
    private String invention;
    int n = 14;
    
    public ComputingPioneers(String firstName, String lastName, String invention){
        this.firstName = firstName;
        this.lastName = lastName;
        this.invention = invention;
    }
    
    public String getfirstName(){
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public String getinvention() {
        return invention;
    }
    
public static void main(String[] args)throws Exception
  {
    System.out.println("./src/main/java/moniqueproject/computerpioners/ComputerPioneers.txt");
    
    //Stack stack = new Stack();
    //Queues queue = new Queues();

    File file = new File("./src/main/java/moniqueproject/computerpioners/ComputerPioneers.txt");

    /*if (!stackfile.exists()) {
        stackfile.createNewFile();
        System.out.println("File does not exist");
    } else {
        System.out.println("File is done");
    }*/
    FileReader r = new FileReader(file);
    BufferedReader reader = new BufferedReader(r);

    String s = null, line = null;

    // First, split to be converted
    //reader.readLine();
    //System.out.println("line is: " + reader.readLine());
    int counter = 1;
    while ((line = reader.readLine()) != null) {
        s += line;
        counter++;
        System.out.println(s);
        System.out.println(counter + s + " ");
    }
   
  }

    

        /* String[] splitLine = line.trim().split(";");
        if (splitLine.length == 2)
        stack.Push(new Data(splitLine[0], splitLine[1]));
        stack.pop(new Data(splitLine[0], splitLine[1]));
        Stack obj1 = new Stack();
        obj1.convertToDec(n);
        obj1.convertToChar(n);
        }*/
        //  reader.close();
        /*File queuefile = new File("queue.txt");
        if (!queuefile.exists()) {
        queuefile.createNewFile();
        } else {
        System.out.println("File is done");
        }
        BufferedReader read = null;
        read = new BufferedReader(new FileReader(queuefile));
        // Skip headline
        read.readLine();
        while ((line = read.readLine()) != null) {
        String[] splitLine = line.trim().split(",");
        if (splitLine.length == 3)
        queue.insert(new Data(splitLine[0], splitLine[1], splitLine[2]));
        }
         */
  }


  
    
    
    
