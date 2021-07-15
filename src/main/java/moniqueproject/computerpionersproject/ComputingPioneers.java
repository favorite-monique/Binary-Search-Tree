
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moniqueproject.computerpionersproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static java.lang.Math.E;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author 44773
 */
public class ComputingPioneers {
    
    private String firstName;
    private String lastName;
    private String invention;
    int n = 14;
    //build a model constructor 

    /**
     *
     * @param firstName
     * @param lastName
     * @param invention
     */
    public ComputingPioneers(String firstName, String lastName, String invention){
        this.firstName = firstName;
        this.lastName = lastName;
        this.invention = invention;
    }
    //get

    /**
     *
     * @return
     */
    public String getfirstName(){
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getlastName() {
        return lastName;
    }

    /**
     *
     * @return
     */
    public String getinvention() {
        return invention;
    }
    
    /**
     *
     * @param args
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args)throws Exception 
  {
      System.out.println("./src/main/java/moniqueproject/computerpionersproject/ComputerPioneers.txt");
      File stackfile = new File("./src/main/java/moniqueproject/computerpionersproject/ComputerPioneers.txt");
      if(!stackfile.exists()) {
          stackfile.createNewFile();
          System.out.println("File does not exist");
      } else {
         ADTQueueCP queue;
          queue = new ADTQueueCP();
         
         queue.createQueue();
         
         System.out.println("Queue is empty with" + queue.isEmpty());
         System.out.println("File is done");
      }
      FileReader r = new FileReader(stackfile);
      BufferedReader reader = new BufferedReader(r);
      
      String s, line = null;
      //int counter = 1;
      while((s = reader.readLine()) !=null) {
          //counter++;
          queue.enqueue(s);
          //System.out.println(counter + "." + s);
      }
      ADTQueueCP queue;
      System.out.println("This is the queue");
      queue.displayQueue();
  }
    StackCPLab.classStackCPLab();
 }

    /**
     *
     * @param 
     * @return
     */
    /*public static String[] getWords(String s) {
          s = s.replaceAll("\\(0.9", "");
          s = s.replaceAll("\\s+", "");
          s = s.replaceAll("\\p(Punct)", "");
          String[] values;
          String line = null;
         // values = line.split(";");
          Queue<String> ADTQueueCP;
          ADTQueueCP = new LinkedList<>();
          ADTQueueCP.add(s);
          System.out.println(ADTQueueCP.add(s));
          //System.out.println(values[1] + values[2]);
          //return s.split(";");
        return null;

        
    } 

    
      

  
  
    /*try {
      File myObj = new File("/src/main/java/moniqueproject/computerpionersproject/ComputerPioneers.txt");
        try (java.util.Scanner myReader = new Scanner(myObj)) {
            int counter = 1;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                counter++;
                System.out.println( counter +data + "");
            } }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
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
  


  
    
    
    
