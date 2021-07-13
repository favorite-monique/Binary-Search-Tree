/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moniqueproject.computerpionersproject;

/**
 *
 * @author 44773
 */
public class Stack {
  
    public static int convertToDec(String binValue){
        
        int decValue = 0;
        int input = 0;
        int number = input;
        int baseNumber = 2;
        int lastDigit;
        //conversion code
        //check if provided number is binary
        if(isbinValue(number)){
            while(number != 0){

                //takes last digit from input
                lastDigit = number % 10;
                //counts decimal number
                decValue += lastDigit * baseNumber;
                /*every time increase baseNumber by 2
                (base number is 1 ,because when u start from right 2pow0 is always 1)
                 */
                baseNumber *= 2;
                //removes last digit from input
                number /= 10;
            }
        }
        else if(!isbinValue(number)){
            System.out.println("Wrong!\nProvide binary number - contains only 0 and 1");
        }
                return decValue;
    }
    
    

    private static boolean isbinValue(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static int convertToChar(int decValue){
     
        //type casting
        char myChar = (char)decValue;
        return 0;
        
    }


    void convertToDec(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
   
}
