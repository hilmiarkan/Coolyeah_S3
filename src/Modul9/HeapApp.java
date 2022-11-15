/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9;

/**
 *
 * @author HP
 */
public class HeapApp {
    public static void main(String[] args) {
        int maxSize = 14;
        Heap h = new Heap(maxSize);

          h.insert(2);
          h.insert(5);
          h.insert(8);
          h.insert(13);
          h.insert(19);
          h.insert(21);
          h.insert(32);
          h.insert(48);
          h.insert(54);
          h.insert(60);
          h.insert(70);
          h.insert(80);
          h.insert(90);
//
//            System.out.println("Node sebelum diurutkan ");
//           for (int i = 0; i< maxSize; i++){
//               int value =(int) (Math.random()*100);
//               h.insertAt(i, value);
//           }
//
//
////          h.remove();
////          h.change(8, 16);
//            h.displayHeap();
//
//            System.out.println("Node sesudah diurutkan ");
//            h.HeapSort();
//            h.displayArray();

        h.displayHeap();
          
    }
}
