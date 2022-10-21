/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul3;

/**
 *
 * @author arkan
 */
public class StackReverser {

    private String input;
    private String output;

    public StackReverser(String in) {
        input = in;
    }

    public String doRev() {
        int stackSize = input.length();
        StackReverse theStack = new StackReverse(stackSize);

        for (int j=0; j < input.length(); j++) {
            char ch = input.charAt(j);
            theStack.push(ch);
        }

        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output +ch;
        }
        return output;
    }
}
