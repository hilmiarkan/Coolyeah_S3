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
public class DataArray {

    private Mahasiswa[] mhs;
    private int nElemen;

    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }

    public Mahasiswa find(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {

            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }

        if (i == nElemen) {
            return null;
        } else {
            return mhs[i];
        }
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }

    public boolean delete(long searchNim) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;

            }
        }

        if (i == nElemen) {
            return false;
        } else {

            for (int j = i; j < nElemen; j++) {
                mhs[j] = mhs[j + 1];
            }
            nElemen--;
            return true;

        }
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {

            mhs[i].displayMhs();
        }
    }

    public void BubbleSort() {
        int batas, i;
        for (batas = nElemen-1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNim() > mhs[i + 1].getNim()) {
                    swap(i, i + 1);
//                    displayArray();
                }
            }
        }
    }

    public void swap(int one, int two) {
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }

    public void BubbleSortDescending() {
        int batas, i;
        for (batas = nElemen-1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNim() < mhs[i + 1].getNim()) {
                    swap(i + 1, i);
//                    displayArray();
                }
            }
        }
    }

    public void InsertionSort() {
        int i, curIn;

        for (curIn = 1; curIn < nElemen; curIn++) {
            Mahasiswa temp = mhs[curIn];

            i = curIn;

            while (i > 0 && mhs[i - 1].getNim() >= temp.getNim()) {
                mhs[i] = mhs[i - 1];
//                displayArray();
                i--;
            }
            mhs[i] = temp;
            System.out.print("penyisipan ");
//            displayArray();
        }
    }

    public void SelectionSortByName() {
        int i, curIn;

        for (curIn = 1; curIn < nElemen; curIn++) {
            Mahasiswa temp = mhs[curIn];

            i = curIn;

            while (i > 0 && mhs[i - 1].getNama().compareTo(temp.getNama()) > 0) {
                mhs[i] = mhs[i - 1];
//                displayArray();
                --i;
            }
            mhs[i] = temp;
//            System.out.print("penyisipan ");
//            displayArray();
        }
    }
}
