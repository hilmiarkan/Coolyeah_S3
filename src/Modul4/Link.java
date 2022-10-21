/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul4;

/**
 *
 * @author arkan
 */
public class Link {

    public int Data;
    public Link next;
    public Link previous;

    public Link(int Data) {
        this.Data = Data;
    }

    public void displayLink() {
        System.out.print(Data + " ");
    }

}
