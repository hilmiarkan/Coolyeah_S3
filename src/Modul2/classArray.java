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
public class classArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] array = new int[100];
        int nElemen = 0;
        array[0] = 30;
        array[1] = 20;
        array[2] = 60;
        array[3] = 70;
        array[4] = 50;
        array[5] = 10;
        nElemen = 6;

        for (int i = 0; i < nElemen; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
