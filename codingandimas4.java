public class codingandimas4 {
     static int langkahLinear = 0;
        static int langkahBinary = 0;
         //algoritma A pencarian linear, 0(n)
         static int linearSearch(int[] arr, int target) {
            langkahLinear = 0;
            for (int i = 0; i < arr.length; i++) {
                langkahLinear++;
                if (arr[i] == target) return i;
            }
            return -1;
         }
         //algoritma b binary searh (array harus terurut naik), 0(log n)
         static int binarySearch(int[] arr, int target){
            langkahBinary = 0;
            int kiri = 0, kanan = arr.length - 1;
            while (kiri <= kanan) {
                langkahBinary++;
                int tengah = kiri + (kanan - kiri) /2; //hindari overflow
                if (arr[tengah] == target) return tengah;
                if (arr[tengah] < target) kiri = tengah +1;
                else kanan = tengah - 1;
            } 
            return - 1;
         }
         static void uji(int[] arr, int target){
            int a = linearSearch(arr, target);
            int b = binarySearch(arr, target);
            System.out.println("cari " + target + ": ");
            System.out.println(" Binary -> indeks" + b + ", pemeriksaan = " + langkahBinary);
            System.out.println(" Linear -> indeks" + a + ", pemeriksaan = " + langkahLinear);
         }
         public static void main(String[] args) {
            // 10.000 elemen terurut: 0, 1, 2,..., 9999
            int[] arr = new int[10000];
            for (int i = 0; 1 < arr.length; i++) arr[i] = i;
            uji(arr, 75); //ada di dekat awal
            uji(arr, 9999); //elemen terakhir (kasus terburuk linear) 
            uji(arr,20000); // tidak ada kasus terburuk keduanya
            //batas teoretis binary search: floor(log2(n)) +1
            int maks = (int) (Math.log(arr.length) / Math.log(2));
            System.out.println("\nBatas maksimum binary search untuk n = 10000" + maks);
         }
}
