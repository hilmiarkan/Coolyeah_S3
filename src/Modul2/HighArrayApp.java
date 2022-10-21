/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul2;

import Modul1.*;

/**
 *
 * @author arkan
 */
public class HighArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

//        arr.insert(70);
//        arr.insert(80);
//        arr.insert(75);
//        arr.insert(55);
//        arr.insert(85);
//        arr.insert(25);
//        arr.insert(30);
//        arr.insert(00);
//        arr.insert(90);
//        arr.insert(40);
//        arr.display();
//        arr.testing();

        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(00);
        arr.insert(90);
        arr.insert(40);

        arr.display();

        int key = 25;
        if (arr.find(key) != arr.size()) {
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }

//        arr.BubbleSortDescending();
        arr.InsertionSort();

        arr.display();
    }
}
