/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author arkan
 */
public class faktorial {
    public static int hitung(int angka) {
        if ( angka == 1) {
            return 1;
        } else {
            return angka * hitung(angka - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("5! = " + hitung(5));
    }
}