/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul3;

/**
 *
 * @author arkan
 */
public class Antrian {
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Antrian(int size){
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear =-1;
        nItems=0;
    }
    public void insert(String value){
        if(rear != maxSize-1){
            queArray[++rear] = value;
            nItems++;
            System.out.println(value + " masuk antrian");
        }else{
            rear = -1;
            System.out.println("Maaf "+value+" , Antrian masih penuh");
        }

    }
    public String remove(){
        String temp = queArray[front++];
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        System.out.println(temp + " keluar antrian");
        insertKosong("kosong");
        return temp;
    }

    public void insertKosong(String value){
        if(rear != maxSize - 1){
            queArray[++rear]= value;
            nItems++;
        }else{
            rear= -1;
        }
    }

    public String peekFront(){
        return queArray[front];
    }
    public boolean isEmpty(){
        return (nItems==0);
    }
    public boolean isFull(){
        return (nItems==maxSize);
    }
    public int size(){
        return nItems;
    }
    public void show(){
        for(int i=0; i<nItems; i++){
            String isi = queArray[(front + i)% maxSize];
            System.out.print( isi +" ,");
        }
        System.out.println("");
    }
}