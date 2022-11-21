/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10;

/**
 *
 * @author HP
 */

public class Stack {
    private int[] stackArray;
    private int top;
    private int size;

    public Stack(int size){
        this.size = size; 
        stackArray = new int [size];
        this.top = -1;
 }
 
 public void push(int item){
     stackArray[++top]= item;
 }
 
 public int pop(){
     return stackArray[top--];
 }
 
 public int peek(){
     return stackArray[top];
 }
 
 public boolean isEmpty(){
     return (top == -1);
 }
 


}

