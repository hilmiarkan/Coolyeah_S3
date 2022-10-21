/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author arkan
 */
public class nilai_pangkat {

    public static int pangkat(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
//aturan exponen ke-2
            return base * pangkat(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("2^10 = " + pangkat(2, 10));
        System.out.println("3^5 = " + pangkat(3, 5));
        System.out.println("3^16 = " + pangkat(3, 16));
    }
}
