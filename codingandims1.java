public class codingandims1 {
     public static void main(String[] args) {
 //1.buat array int untuk menyimpan lima nilai:80,75,90,65,
 // dan 85.

  int[] nilai = {80,75,90,65,85};

  //2.tampilkan seluruh nilai menggunakan perulangan.
   System.out.print("Daftar Nilai Mahasiswa:");
   for (int i = 0; i < nilai.length; i++) {
        System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
   }
   //3. tampilkan nilai mahasiswa pada indeks ke-2

   System.out.println("\nNilai pada indeks ke-2: " + nilai[2]);

   System.out.println("\nPenjelasan:");
   System.out.println("Indeks array dimulai dari 0, sedangkan urutan mahasiswa dimulai dari 1.");
   System.out.println("jadi indek ke-2 adalah mahasiswa urutan ke-3.");
        
    }
}

