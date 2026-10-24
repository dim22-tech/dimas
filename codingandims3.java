public class codingandims3 {
     public static void main(String[] args) {
        int[] nilai = {78, 90, 65, 90, 85, 72, 95, 85};
        int n = nilai.length;

        // salin array asli agar urutan mahasiswa tetap terjaga
        int[] urut = new int[n];
        for (int i = 0; i < n; i++) urut[i] = nilai[i];

        //1 urutan dari tertinggi ke terendah (buble sort. tanpa array. sort())
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (urut[j] < urut[j + 1]) {
                    int temp = urut[j];
                    urut[j] = urut[j - 1];
                    urut[j + 1] = temp;
                }
            } 
        }
        System.out.print("nilai terurut (tertinggi ke rendah): ");
        for (int v : urut) System.out.print(v + " ");
        System.out.println();

        //2. tiga nilai tertinggi yang berbeda
        int[] top3 = new int[3];
        int hitung = 0;
        for (int i = 0; i < n && hitung < 3; i++){
            boolean sudahAda = false;
            for (int j = 0; j < hitung; j++) {
                if (top3[j] == urut[i]) {
                    sudahAda = true;
                    break;
                }
            }
            if (! sudahAda) top3[hitung++] = urut[i];
        }
        System.out.print("tiga nilai tertinggi yang berbeda: ");
        for (int i = 0; i < hitung; i++) System.out.print(top3[i] + " ");
        System.out.print(top3);

        //3dan4. peringkat setiap mahasiswa ( nilai sama = peringkat sama)
        // peringkat = 1 jumlah nilai yang lebih besar
        System.out.println("\nPeringkat setiap mahasiswa: ");
        for (int i = 0; i < n; i++) {
            int peringkat = 1;
            for (int j = 0; i < n; j++) {
                if (nilai[j] > nilai[i]) peringkat++;
            }
            System.out.println("mahasiswa " + (i + 1) + " - nilai: " + nilai[i] + " - peringkat: " + peringkat);
        } 
     }
}
