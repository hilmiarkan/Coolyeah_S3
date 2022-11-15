/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.HashTables_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
 *
 * @author HP
 */
public class HashTableApp {
    public static void main(String[] args) throws IOException {
        
      HashTable theHash = new HashTable(15);
        
//        theHash.insert(2);
//        theHash.insert(5);
//        theHash.insert(8);
//        theHash.insert(13);
//        theHash.insert(19);
//        theHash.insert(21);
//        theHash.insert(32);
//        theHash.insert(48);
//        theHash.insert(54);
//        theHash.insert(60);
//        
//        theHash.displayTable();
          int value ;
          
          while (true) {
            System.out.print("Enter first letter of show, "
                    + "insert, find, or delete : ");
            int choice = getChar();
            switch (choice) {
                case 'i':
                    System.out.print("Enter value and data to"
                            + " insert: ");
                    value = getInt();
                   
                    theHash.insert(value);
                    break;
                case's':
                        theHash.displayTable();
                     break;
                case 'f':
                    System.out.println("Enter value to find: ");
                    value = getInt();
                    Data found = theHash.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displaydata();
                        System.out.print("\n");
                    } else {
                        System.out.print("Could not find "
                                + value);
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    Data didDelete = theHash.delete(value);
                    System.out.println("Deleted " + value);
                    break;
                 default:
                     System.out.println("Invalid entry ");

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

