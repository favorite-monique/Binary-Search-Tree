/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moniqueproject.computerpionersproject;

/**
 *
 * @author 44773
 * @param <E>
 */
/*public class ADTStackCP<E> implements IStackE<E>{
    /**
     * Use this private method to check that an integer value
     * is within a set range.
     * @param valueToCheck the value to be checked.
     * @param minValueInclusive the starting value.
     * @param maxValueInclusive the end value.
     * @return true if within the range otherwise return false
     */
   /* private static boolean inRange(int valueToCheck, int minValueInclusive, int maxValueInclusive) {
        return (valueToCheck >= minValueInclusive && valueToCheck <= maxValueInclusive);
    }
    
    private int numberOfStackElements = 0;
    /**
     * DEFAULTMAXELEMENTS can be considered a "constant" value.
     * i.e. set at compile time and can't be changed.
     */
   // private static final int DEFAULTMAXELEMENTS = 25;
    //private int MAXELEMENTS;
    //private int top = -1;
    //private E[] aStack;

    /**
     * Default constructor
     */
   /* ADTStackE_RA() {
        this.MAXELEMENTS = DEFAULTMAXELEMENTS;
        this.aStack = (E[])new Object[this.MAXELEMENTS];
        this.numberOfStackElements = 0;
        this.top = -1;
    }*/
    /**
     * Use this version of the constructor to create a specific stack size.
     * If the specified stack size is not in the range 1 to 25 then the
     * stack will be created using the DEFAULTMAXELEMENTS value (25)
     * @param raSize size of the array
     */
    /*ADTStackE_RA( int raSize ) {
        if ( !inRange( raSize, 1, DEFAULTMAXELEMENTS ) ) {
            System.out.println("Size of array not allowed! Assuming " + DEFAULTMAXELEMENTS );
            raSize = DEFAULTMAXELEMENTS;
        }
        this.MAXELEMENTS = raSize;
        this.aStack = (E[])new Object[this.MAXELEMENTS];
        this.numberOfStackElements = 0;
        this.top = -1;
    }*/
    //@Override
   /* public void createStack() {
        this.aStack = (E[])new Object[this.MAXELEMENTS];
        this.numberOfStackElements = 0;
        this.top = -1;        
    }*/

    //@Override
  /*  public void push(E e) {
        if ( isFull() ) {
            System.out.println(String.format("Array is full, only %3d elements allowed", this.MAXELEMENTS));
        } else {
            this.top ++;
            this.aStack[this.top] = e;
            this.numberOfStackElements ++;
        }
    }*/

    //@Override
    /*public E pop() {
        if ( isEmpty() ) {
            throw new NullPointerException("Can't pop stack its Empty!!");
        } else {
            this.numberOfStackElements --;
            E e = this.aStack[this.top];
            this.top --;
            return e;            
        }
    }

    @Override
    /*public E peek() {
        if ( isEmpty() )
            throw new NullPointerException("Can't peek at top item as the stack is Empty!!");
        else
           return this.aStack[this.top];
    }*/

    //@Override
    /*public boolean isEmpty() {
        return ( this.getStackSize() == 0 );
    }
    
    @Override
    public boolean isFull() {
        return ( this.numberOfStackElements == this.MAXELEMENTS );
    }
    
    public void displayStack() {
        System.out.println( this.toString() );
    }*/

   // @Override
   /* public String toString() {
        StringBuilder sb = new StringBuilder( "\n" );
        int tmp = this.getStackSize() - 1;
        if(isEmpty())
        {
            sb.append("The stack is Empty!!");
        }
        else
        {
            while (tmp > -1) {
                sb.append( this.aStack[ tmp ] + "\n");
                tmp --;
            }
        }
        return sb.toString();
    }
    
    public int getStackSize() {
        return this.numberOfStackElements;
    }

}
*/



/*{
  
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
              //  baseNumber *= 2;
                //removes last digit from input
               //number /= 10;
           // }
       // }
        //else if(!isbinValue(number)){
            //System.out.println("Wrong!\nProvide binary number - contains only 0 and 1");
       // }
                //return decValue;
   // }
    
    

    /*private static boolean isbinValue(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
   /* public static int convertToChar(int decValue){
     
        //type casting
        char myChar = (char)decValue;
        return 0;
        
    }*/


    //void convertToDec(int n) {
      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
