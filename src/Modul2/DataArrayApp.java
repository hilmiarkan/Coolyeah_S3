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
public class DataArrayApp {

    /**
     * @param args the command line arguments.
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650270, "Jundi", "Malang");
        arr.insert(16650230, "Ahmad", "Sidoarjo");
        arr.insert(16650280, "Ismail", "Banyuwangi");
        arr.insert(16650260, "Sofi", "Semarang");
        arr.insert(16650220, "Dinda", "Bandung");
        arr.insert(16650240, "Rais", "Ambon");
        arr.insert(16650250, "Helmi", "Madura");
        arr.insert(16650200, "Bima", "Madiun");
        arr.insert(16650210, "Coki", "Malang");

        System.out.println("Data mahasiswa sebelum diurutkan:");
        arr.displayArray();

        System.out.println("Sorting Mahasiswa by NIM:");
        arr.BubbleSort();
        arr.displayArray();

        System.out.println("Sorting Mahasiswa by NAME:");
        arr.SelectionSortByName();
        arr.displayArray();

//        long searchKey = 16650270;
//        Mahasiswa mhs = arr.find(searchKey);
//        if (mhs != null) {
//
//            System.out.println("\nketemu");
//            mhs.displayMhs();
//        } else {
//            System.out.println("ga ketemu " + searchKey);
//        }
//
//        searchKey = 16650240;
//        System.out.println("\nhapus nim: " + searchKey);
//        arr.delete(searchKey);


    }
}
