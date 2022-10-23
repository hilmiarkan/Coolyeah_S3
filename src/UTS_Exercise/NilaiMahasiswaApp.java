package UTS_Exercise;

import Modul4.DoublyLinkedList;

public class NilaiMahasiswaApp {

    public static void main(String args[]) {
        NilaiMahasiswa theList = new NilaiMahasiswa();

        theList.insertLast(1765027, 100.0);
        theList.insertLast(1765009, 95.6);
        theList.insertLast(1765013, 95.0);
        theList.insertLast(1765025, 85.5);
        theList.insertLast(1765035, 80.0);
        theList.insertLast(1765010, 75.0);
        theList.insertLast(1765023, 70.3);
        theList.insertLast(1765029, 60.5);
        theList.insertLast(1765011, 55.5);
        theList.insertLast(1765011, 52.7);
        theList.insertLast(1765011, 52.7);
        theList.displayForward();
        theList.average();
        theList.median();
        theList.ceklulus();

    }
}
