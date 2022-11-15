/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.Nyoba;

/**
 *
 * @author HP
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashTableApp {
    public static void main(String[] args) throws IOException {

       
       HashTable ht = new HashTable(15);
        
        int value;
        while (true) {
            System.out.print("Masukkan Perintah show, " + "insert,find,delete : ");
            int choice = getChar();
            switch (choice) {
                case 'i':
                    System.out.print("Enter value and data to " + "insert : ");
                    value = getInt();
                    ht.insert(value);
                    break;
                case 's':
                    ht.displayTable();
                    break;
                case 'f':
                    System.out.println("Enter value to find : ");
                    value = getInt();
                    Data found = ht.find(value);
                    if (found != null) {
                        System.out.println("found :");
                        found.displaydata();
                        System.out.println("\n");
                    } else {
                        System.out.println("could not find" + value);
                    }
                    break;
                case 'd':
                    System.out.println("enter value to delete : ");
                    value = getInt();
                    Data DidDelete = ht.delete(value);
                    System.out.println("Delete " + value);
                    break;
                default:
                    System.out.println("Invalid entry");

            }
        }

    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
