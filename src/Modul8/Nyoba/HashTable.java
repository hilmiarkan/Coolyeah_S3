
package Modul8.Nyoba;

/**
 *
 * @author HP
 */
public class HashTable {
  private Data[] hashArray;
    private int size, a, b;

    public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];
    }

    public void displayTable() {
        System.out.println("table : ");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null) {
                System.out.println(" | " + j + "\t | "+ hashArray[j].getKey() + " |");
            } else {
                System.out.println(" | " + j + "\t -- |");
            }
        }
        System.out.println();
    }

    public int hashFunc(int key) {
        return key % size;
    }

    public void insert(int data) {
        Data item = new Data(data);
        int key = item.getKey();
        a = hashFunc(key);
        int hashVal = a;
        b = 0;
        while (hashArray[hashVal] != null) {
            ++b;
            hashVal = (a + b * b) % size;
        }
        hashArray[hashVal] = item;
    }

    public Data delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;

                return temp;
            }
            b++;
            hashVal = (a + b * b) % size;
        }
        return null;
    }

    public Data find(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            b++;
            hashVal = (a + b * b) % size;
        }
        return null;
    }
}