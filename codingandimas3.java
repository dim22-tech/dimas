import java.util.Collections;
import java.util.Map;
import java.util.*;
public class codingandimas3 {
    public static void main(String[] args) {
        int[] p = {250, 300, 180, 420, 350, 300, 500, 150, 420, 380};

        // total data dan rata-rata (akumulasi)
        int total = 0;
        for (int x : p) total += x;
        double rata = (double) total / p.length;
        System.out.print("1. total= "+ total + "(ribu), rata-rata = " + rata + "(ribu)");
        
        //2. hari di atas rata-rata (filter dengan nilai netap)
        System.out.println("2. hari di atas rata-rata: ");
        for (int i = 0; i < p.length; i++) {
            if (p[i] > rata) {

            }
        }

        // 3 modus (tabel frekuensi)
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int x : p) freq.merge(x, 1, Integer::sum);
        int maxFreq = Collections.max(freq.values());
        System.out.print("3.modus (muncul" + maxFreq + " x): ");
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() == maxFreq) System.out.print(e.getKey() + " ");
        }
        System.out.println();

        // 4.dua hari tertinggi (pengurutan indeks berdasarkan nilai, menurun)
        Integer[] idx = new Integer[p.length];
        for (int i = 0; i < p.length; i++) idx[i] = i;
        Arrays.sort( idx, (a, b) -> Integer.compare(p[b], p[a]));
        // stabil nilai kembar urut hari
        System.out.println("4. dua hari tertinggi: ");
        for (int k = 0; k < 2; k++){
            System.out.println("hari " + (idx[k] + 1) + ": " + p[idx[k]]);
        }

        //5 hari lebih rendah dari hari sebelumnya (perbandingan berpasangan)
        int turun = 0;
        for ( int i = 1; i < p.length; i++){
            if (p[i] < p[i - 1]);
        }
        System.out.println("5 jumlah hari lebih rendah dari hari sebelumnya = " + turun);
    }
}
