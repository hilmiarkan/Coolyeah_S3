/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

/**
 *
 * @author arkan
 */
public class ArraysApp {
    public static void main(String[] args) {
        Arrays oke = new Arrays(10);
        oke.insert(8);
        oke.insert(22);
        oke.insert(7);
        oke.insert(9);
        oke.insert(31);
        oke.insert(19);
        oke.insert(4);
        oke.insert(0);
        oke.display();

        oke.ShellSort();
        oke.display();
        /*lakukan penambahan 10 item yang tidak berurutan. Tampilkan data sebelum diurutkan kemudian
        lakukan pengurutan menggunakan mergeSort dan tampilkan data setelah diurutkan!
        Jalankan program yang telah Anda lengkapi dan tulis outputnya!*/

    }
}
