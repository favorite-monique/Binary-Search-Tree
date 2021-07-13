/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moniqueproject.computerpionersproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
    
public  void main(String[] args) throws IOException {

    Stack stack = new Stack();
    Queues queue = new Queues();

    File stackfile = new File("stack.txt");

    if (!stackfile.exists()) {
        stackfile.createNewFile();
    } else {
        System.out.println("File is done");
    }
    FileReader r = new FileReader(stackfile);
    BufferedReader reader = new BufferedReader(r);

    String line = null;

    // First, split to be converted
    reader.readLine();

    while ((line = reader.readLine()) != null) {

        String[] splitLine = line.trim().split(";");

        if (splitLine.length == 2)
            stack.Push(new Data(splitLine[0], splitLine[1]));
            stack.pop(new Data(splitLine[0], splitLine[1]));
            
            Stack obj1 = new Stack();
        
            obj1.convertToDec(n);
            obj1.convertToChar(n);
    }
    reader.close();

    File queuefile = new File("queue.txt");

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

    read.close();

}
    
    
    
    
}
