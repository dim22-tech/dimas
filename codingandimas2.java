import java.util.Scanner;

public class codingandimas2 {
    public static void main(String[] args) {
        int[] produk = {101, 105, 110, 115, 120, 125,};
        Scanner input = new Scanner(System.in);

        System.out.print("masukan kode produk: ");
        int kode = input.nextInt();

        int indeks = -1;
        int pemeriksaan = 0;

        //linear search
        for (int i = 0; i < produk.length; i++){
            pemeriksaan++;
            if (produk[i] == kode) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("produk ditemukan di indeks: " + indeks);
        } else {
            System.out.println("produk tidak tersedia. ");
        }
        System.out.println("jumlah elemen di periksa: " + pemeriksaan);

        input.close();
    }
}
