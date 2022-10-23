package UTS_Exercise;

public class NilaiMahasiswa {
    private Link first;
    private Link last;

    public double[] a;

    public NilaiMahasiswa() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(long NIM, double score) {
        Link newLink = new Link(NIM, score);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.prev = last;
        }
        last = newLink;
    }

    public void displayForward() {
        System.out.println("Daftar nilai mahasiswa:");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void average() {
        Link current = first;
        double[] ewe = new double[11];
        int x = 0;
        double jumlah = 0;
        while (current != null) {
            ewe[x] = current.getScore();
            current = current.next;
            jumlah = jumlah + ewe[x];
            x++;

        }
        double rata = jumlah/x;
        System.out.println("Rata-rata: " + rata);
    }

    public void median() {

        Link current = first;
        double[] ewe = new double[11];
        int x = 0;
        while (current != null) {
            ewe[x] = current.getScore();
            current = current.next;
            x++;

        }
        a = ewe;
        int out=x-1, in, _out=0;

        boolean isSwap = true;

        while(isSwap) {
            isSwap = false;

            for(in=_out; in<out; in++) {
                if( a[in] > a[in+1] ) {
                    swap(in, in+1);
                    isSwap=true;
                }
            }

            for(in=out-1; in>_out; in--) {
                if(a[in] < a[in-1]) {
                    swap(in, in-1);
                    isSwap=true;
                }
            }

            _out++;
            out--;
        }
//        for(int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }

        if(a.length % 2 == 0) {
            double yes = a[a.length/2];
            double yes2 = a[(a.length/2)+1];
            double median = yes+yes2/2;
        } else {
            System.out.println("median: " + a[(a.length/2)]);
        }



    }

    private void swap(int one, int two) {
        double temp = a[one];
        a[one] = a[two];
        a[two] = temp;

    }

    void ceklulus() {
        int jumlahlulus = 0,jumlahgagal = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] >= 70.0) {
                jumlahlulus++;
            } else {
                jumlahgagal++;
            }
        }
        System.out.println("Alhamdulillah " + jumlahlulus + " mahasiswa lulus");
        System.out.println(jumlahgagal + " mahasiswa perlu belajar lagi");
    }

}
