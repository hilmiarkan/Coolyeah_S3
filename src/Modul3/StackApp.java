/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul3;

/**
 *
 * @author arkan
 */
public class StackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Stack theStack = new Stack(10);
        System.out.println(">> push some items");
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        System.out.println("\n>> pop items in the stack");

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value + " ");
        }
    }
}
