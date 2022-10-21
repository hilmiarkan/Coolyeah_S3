package Modul6;

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

        System.out.println("Sebelum Data diurut");
        arr.displayArray();

        arr.MergeSort();
        arr.displayArray();
        arr.ShellSort();
        arr.displayArray();
        arr.QuickSort();
        arr.displayArray();
    }
}