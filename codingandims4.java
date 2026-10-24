public class codingandims4 {
    public static void main(String[] args) {
        int[] scores = {80, 70, 90, 60,};

        //kode asli (salah): i <= scores.length -> ArrayIndexOutOfBoundsException
        // kode asli (salah) : total/scores.length -> pembagian Integer

        //perbaikan
        if (scores.length ==0) {
            System.out.println( "Array kosong, rata-rata tidak dapat dihitung");
            return;
        }
        int total = 0;
        for (int i = 0; i < scores.length; i++) { //pakai < bukan <=
            total += scores[i];
        }
        double average = (double) total / scores.length; // cash ke double
        System.out.println("total: " + total);
        System.out.println("rata-rata: " + average);
        //demo: kenapa cash ke double penting (total tidak habis di bagi)

        int[] data = {80, 70, 90, 60,};
        int sum = 0;
        for (int x : data) sum += x;

        double salah = sum / data.length; //305 / 4 = 76 -> 76,0
        double benar = (double) sum / data.length; // 76,25
        System.out.println(" \nDemo data {80, 70, 90,60,}");
        System.out.println("tanpa cash: " + salah);
        System.out.println("dengan cash: " + benar);


    }
}
