/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul1;

/**
 *
 * @author arkan
 */
public class HighArray {

    private int[] arr;

    private int nElemen;

    public HighArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void insertandsort(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (arr[i] > value) {
                break;
            }
        }
        for (int j = nElemen; j > i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = value;
        nElemen++;

    }

    public int find(int key) {
        int batasBawah = 0;
        int batasAtas = nElemen - 1;
        int curIn;

        while (true) {
            curIn = (batasBawah + batasAtas) / 2;
            if (arr[curIn] == key) {
                return curIn;
            } else if (batasBawah > batasAtas) {
                return nElemen;
            } else {
                if (arr[curIn] < key) {
                    batasBawah = curIn + 1;
                } else {
                    batasAtas = curIn - 1;
                }
            }
        }
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                arr[j] = arr[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public int size() {
        return nElemen;
    }

    public void testing() {
        System.out.println("nElemen = " + nElemen);
        System.out.println("arr.length = " + arr.length);
    }
}
