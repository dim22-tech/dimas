public class codingandimas1 {
    public static void main(String[] args) {
         
        int[] stock = {12,8,15,6};

        //1.Tampilkan stock produk pertama dan terakhir
        System.out.print("Stok produk pertama: " + stock[0]);
        System.out.print("Stok produk terakhir: " + stock[stock.length - 1]);

        //2.ubah stok produk kedua menjadi 10
         stock[1] = 10;

         //3.tampilkan seluruh stok setelah perubahan
         System.out.print("\nStok setelah perubahan:");
         for (int i = 0; i< stock.length; i++ ) {
            System.out.println("produkke-" + (i + 1) + ": " + stock[i]);

            //4.mengakses stock[4] akan menyebabkan eror 
            //baris dibawah ini dijadikan komentar agar program 
            //tetap berjalan.

            System.out.print(stock[4]);

         }
    }
}
