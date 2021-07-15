/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moniqueproject.computerpionersproject;

import static java.awt.PageAttributes.MediaType.E;
import static java.lang.Math.E;
import static java.lang.StrictMath.E;
import static javax.print.attribute.standard.MediaSize.Engineering.E;
import static javax.print.attribute.standard.MediaSizeName.E;

/**
 *
 * @author 44773
 * @param <E>
 */
public class ADTQueueCP<E> implements IQueueCP<E>{
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
    
    private int numberOfQueueElements = 0;
    /**
     * DEFAULTMAXELEMENTS can be considered a "constant" value.
     * i.e. set at compile time and can't be changed.
     */
    private static final int DEFAULTMAXELEMENTS = 14;
    private int MAXELEMENTS;
    private int front = 0;
    private int rear = -1;
    private E[] aQueue;
    private  int numberOfQueueElements;

    /**
     * Default constructor
     */
    @SuppressWarnings("unchecked")
    ADTQueueCP() {
        this.MAXELEMENTS = DEFAULTMAXELEMENTS;
        this.aQueue = (E[])new Object[this.MAXELEMENTS];
        this.numberOfQueueElements = 0;
        this.front = 0;
        this.rear = -1;
    }
    /**
     * Use this version of the constructor to create a specific Queue size.
     * If the specified queue size is not in the range 1 to 25 then the
     * queue will be created using the DEFAULTMAXELEMENTS value (25)
     * @param cpSize size of the array
     */
    @SuppressWarnings("unchecked")
    ADTQueueCP( int cpSize ) {
        if ( !inRange( cpSize, 1, DEFAULTMAXELEMENTS ) ) {
            System.out.println("Size of array not allowed! Assuming " + DEFAULTMAXELEMENTS );
            cpSize = DEFAULTMAXELEMENTS;
        }
        this.MAXELEMENTS = cpSize;
        this.aQueue = (E[])new Object[this.MAXELEMENTS];
        this.numberOfQueueElements = 0;
        this.front = 0;
        this.rear = -1;
    }

    /**
     *
     */
    @Override
    @SuppressWarnings("unchecked")
    public void createQueue() {
        this.aQueue = (E[])new Object[this.MAXELEMENTS];
        this.numberOfQueueElements = 14;
        this.front = 0;   
        this.rear = -1;     
    }

    /**
     *
     * @param e
     */

    @Override
    public void enqueue(E e) {
        if ( isFull() ) {
            System.out.println(String.format("Array is full, only %3d elements allowed", this.MAXELEMENTS));
        } else {
            // this.rear ++;
            this.rear = (this.rear + 1)% this.MAXELEMENTS;
            this.aQueue[this.rear] = e;
            this.numberOfQueueElements ++;
        }
    }

    private boolean inRange(int cpSize, int i, int DEFAULTMAXELEMENTS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
   

    /**
     *
     * @return
     */
    @Override
    public E dequeue() {
        if ( isEmpty() ) {
            throw new NullPointerException("Can't dequeue queue its Empty!!");
        } else {
            this.numberOfQueueElements --;
            E e = this.aQueue[this.front];
            // this.front ++;
            this.front = (this.front + 1)% this.MAXELEMENTS;
            return e;            
        }
    }

    /**
     *
     * @return
     */

    /**
     *
     * @return
     */
    @Override
    public E peek() {
        if ( isEmpty() ) {
            throw new NullPointerException("Can't peek at front item as the queue is Empty!!");
        } else {
            return this.aQueue[this.front];
        }
    }

    @Override
    public boolean isEmpty() {
        return ( this.getQueueSize() == 0 );
    }
    
    @Override
    public boolean isFull() {
        return ( this.numberOfQueueElements == this.MAXELEMENTS );
    }
    
    /**
     *
     */
    public void displayQueue() {
        System.out.println( this.toString() );
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder( "\n" );
        //int tmp = this.getStackSize() - 1;
        if(isEmpty())
        {
            sb.append("The queue is Empty!!");
        }
        else
        {
            int qPos = this.front;
            for(int element = 0; element < this.numberOfQueueElements; element++) {
                sb.append(this.aQueue[ qPos ]).append("\n");
                qPos = (qPos + 1)% this.MAXELEMENTS;
            }
        }
        return sb.toString();
    }

    /**
     *
     * @return
     */
    public int getQueueSize() {
        return numberOfQueueElements;
        
    }
}

    
   
    
