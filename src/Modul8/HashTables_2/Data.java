/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.HashTables_2;

/**
 *
 * @author HP
 */
public class Data {
    private int data;
    
    public Data(int data) { 
        this.data = data;
    }

    public int getKey() { 
        return data ;
    }
    
    public void displaydata(){
        System.out.println(data + " found ");
    }
}
