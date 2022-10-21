/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul4;

/**
 *
 * @author arkan
 */
public class DoublyLinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        DoublyLinkedList theList = new DoublyLinkedList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.displayForward();
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayForward();
        theList.displayBackward();
        theList.deleteFirst();
        theList.displayForward();
        theList.deleteLast();
        theList.displayForward();
        theList.deleteKey(11);
        theList.displayForward();
        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88);
        theList.displayForward();
    }
}
