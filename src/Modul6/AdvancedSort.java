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

    //--------------------------------------------------------------------------

    // untuk membandingkan data yang dibagi 2
    public void merge(Mahasiswa[] workspace, int lowindex, int highindex, int upperBound) {
        int j = 0;
        int lowerBound = lowindex;
        int mid = highindex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowindex <= mid && highindex <= upperBound) {
            if (mhs[lowindex].getNama().compareTo(mhs[highindex].getNama()) < 0) {
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
        System.out.println("Merge Sort berdasarkan nama");
        Mahasiswa[] workspace = new Mahasiswa[nElemen];
        recMergeSort(workspace, 0, nElemen - 1);
    }

    //--------------------------------------------------------------------------

    public void ShellSort() {
        System.out.println("Shell Sort berdasarkan NIM");
        int in, out;
        Mahasiswa temp;
        int h = nElemen / 2;

        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = mhs[out];
                in = out;

                while (in > h - 1 && mhs[in - h].getNim() >= temp.getNim()) {
                    mhs[in] = mhs[in - h];
                    in -= h;
                }
                mhs[in] = temp;
            }
            h /= 2;
        }
    }

    //--------------------------------------------------------------------------

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
            while (indexKiri < batasKanan && mhs[++indexKiri].getNama().compareToIgnoreCase(pivot.getNama()) < 0);
            while (indexKanan > batasKiri && mhs[--indexKanan].getNama().compareToIgnoreCase(pivot.getNama()) > 0);
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
        System.out.println("Quick Sort berdasarkan Nama");
        recQuickSort(0, nElemen - 1);
    }

    //--------------------------------------------------------------------------
}

class AdvancedSortApp {

    public static void main(String[] args) {
        int max = 100;
        AdvancedSort arr;
        arr = new AdvancedSort(max);

        arr.insert(16650210, "Jundi", "Malang");
        arr.insert(16650200, "Ahmad", "Sidoarjo");
        arr.insert(16650240, "Ismail", "Banyuwangi");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650220, "Dinda", "Bandung");
        arr.insert(16650280, "Rais", "Ambon");
        arr.insert(16650270, "Halo", "Surabaya");
        arr.insert(16650250, "Nunung", "Ponorogo");
        arr.insert(16650260, "Yati", "Bali");

        System.out.println("Sebelum Data diurut ");
        arr.displayArray();

        arr.MergeSort();
        arr.displayArray();
        arr.ShellSort();
        arr.displayArray();
        arr.QuickSort();
        arr.displayArray();
    }

}