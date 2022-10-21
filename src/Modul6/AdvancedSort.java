package Modul6;

public class AdvancedSort {

    private Mahasiswa[] mhs;
    private int nElemen;

    public AdvancedSort(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }

    //---------------------------------MERGE SORT-----------------------------------------

    // untuk membandingkan data yang dibagi 2
    public void merge(Mahasiswa[] workspace, int lowindex, int highindex, int upperBound) {
        int j = 0;
        int lowerBound = lowindex;
        int mid = highindex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowindex <= mid && highindex <= upperBound) {
//          BERDASARKAN NIM
          if (mhs[lowindex].getNim() <= mhs[highindex].getNim()) {
//          BERDASARKAN NAMA
//            if (mhs[lowindex].getNama().compareTo(mhs[highindex].getNama()) < 0) {

                workspace[j++] = mhs[lowindex++];
            } else {
                workspace[j++] = mhs[highindex++];
            }
        }
        while (lowindex <= mid) {
            workspace[j++] = mhs[lowindex++];
        }
        while (highindex <= upperBound) {
            workspace[j++] = mhs[highindex++];
        }
        for (j = 0; j < nItem; j++) {
            mhs[lowerBound + j] = workspace[j];
        }
    }

    public void recMergeSort(Mahasiswa[] workspace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workspace, lowerBound, mid);
            recMergeSort(workspace, mid + 1, upperBound);
            merge(workspace, lowerBound, mid + 1, upperBound);
        }
    }

    public void MergeSort() {
        System.out.println("Merge Sort berdasarkan NIM");
        Mahasiswa[] workspace = new Mahasiswa[nElemen];
        recMergeSort(workspace, 0, nElemen - 1);
    }

    //------------------------------------SHELL SORT--------------------------------------

    public void ShellSort() {
        System.out.println("Shell Sort berdasarkan Nama");
        int in, out;
        Mahasiswa temp;
        int h = nElemen / 2;

        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = mhs[out];
                in = out;
//              BERDASARKAN NAMA
              while (in > h - 1 && mhs[in - h].getNama().compareTo(temp.getNama()) > 0) {
//              BERDASARKAN NIM
//                while (in > h - 1 && mhs[in - h].getNim() >= temp.getNim()) {
                    mhs[in] = mhs[in - h];
                    in -= h;
                }
                mhs[in] = temp;
            }
            h /= 2;
        }
    }

    //----------------------------------QUICK SORT----------------------------------------

    public void swap(int one, int two) {
        Mahasiswa temp;
        temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }

    public int partitionIt(int batasKiri, int batasKanan, Mahasiswa pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan;
        while (true) {
//            BERDASARKAN NIM
            while (indexKiri < batasKanan && mhs[++indexKiri].getNim() <= pivot.getNim());
            while (indexKanan > batasKiri && mhs[--indexKanan].getNim() >= pivot.getNim());
//            BERDASARKAN NAMA
//            while (indexKiri < batasKanan && mhs[++indexKiri].getNama().compareToIgnoreCase(pivot.getNama()) < 0);
//            while (indexKanan > batasKiri && mhs[--indexKanan].getNama().compareToIgnoreCase(pivot.getNama()) > 0);
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
        }
        swap(indexKiri, batasKanan);
        return indexKiri;
    }

    public void recQuickSort(int batasKiri, int batasKanan) {
        Mahasiswa temp;
        if (batasKanan - batasKiri <= 0) {
            return;
        } else {
            Mahasiswa pivot = mhs[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi - 1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }

    public void QuickSort() {
        System.out.println("Quick Sort berdasarkan NIM");
        recQuickSort(0, nElemen - 1);
    }

    //--------------------------------------------------------------------------
}