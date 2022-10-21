/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul3;

import java.io.*;

/**
 *
 * @author arkan
 */
public class StackReverseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        String input, output;
        while(true) {
            System.out.print("Masukkan kata: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            StackReverser theReverser = new StackReverser(input);
            output = theReverser.doRev();
            System.out.println("Kebalikan: " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
