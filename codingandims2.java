public class codingandims2 {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 65, 90, 55, 85, 70,};

        // 1. hitung rata- rata
        int total = 0;
        for (int n : nilai) total += n;
        double rata = (double) total / nilai.length;
        System.out.println("Rata-rata nilai: "  + rata);

        //2. nilai di atas rata-rata
        System.out.print("nilai di atas rata-rata: ");
        for (int n : nilai) {
            if (n > rata) System.out.print(n + " ");
        }
        System.out.println();

        // 3 jumlah mahasiswa lulus (nilai >= 70)
        int lulus = 0;
        for (int n : nilai) {
            if (n >= 70) lulus++;
        }
        System.out.println("Jumlah mahasiswa lulus: " + lulus);

        // 4. persentase lulus
        double persen = (double) lulus / nilai.length * 100;
        System.out.println("persentase lulus: " + persen + "%");

    }
}
