/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_Praktikum;

/**
 *
 * @author HP
 */
public class Queue {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int size){
        this.maxSize = size;
        queArray = new int[maxSize];
        front = 0;
        rear =-1;
        nItems=0;
    }
    public void insert(int value){
        if(rear != maxSize-1){
           rear = -1;
        }else{
            queArray[++rear] = value; 
            nItems++;
        }
        
    }
    public int remove(){
        int temp = queArray[front++];
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }
    
   
    
    public boolean isEmpty(){
        return (nItems==0);
    }
}




