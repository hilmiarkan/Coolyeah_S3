/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul3;

/**
 *
 * @author arkan
 */
public class AntrianApp {
    public static void main(String[] args) {
        Antrian theQueue = new Antrian(5);
        System.out.println("Beberapa mulai mengantri");
        theQueue.insert("Andi");
        theQueue.insert("Ahmad");
        theQueue.insert("Satrio");
        theQueue.insert("Afrizal");
        theQueue.insert("Sukran");
        theQueue.insert("Mahmud");

        System.out.println("\n>> isi antrian");

        theQueue.show();
        System.out.println("");

        System.out.println(">> Satu persatu mulai keluar antrian");
        while (!theQueue.isEmpty()){
            if(theQueue.peekFront().equals("kosong")){
                System.out.println("\nAntrian Kosong");
                System.out.println("0 person");
                theQueue.show();
                break;
            }
            String n = theQueue.remove();

            theQueue.show();
            System.out.print(" ");
        }
        System.out.println("");
    }
}