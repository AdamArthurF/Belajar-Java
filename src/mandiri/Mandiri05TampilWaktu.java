package mandiri;

public class Mandiri05TampilWaktu {

    public static void main(String[] MbahPutih) {
        long totalMilliDetik,totalDetik,detikSekarang,totalMenit,menitSekarang,totalJam,jamsekarang,jamWIB;

        totalMilliDetik = System.currentTimeMillis();
        totalDetik = totalMilliDetik / 1000;
        detikSekarang = (int) (totalDetik % 60);
        totalMenit = totalDetik / 60;
        menitSekarang = totalMenit % 60;
        totalJam = totalMenit / 60;
        jamsekarang = totalJam % 24;
        jamWIB = (jamsekarang + 7) % 24;

        System.out.printf("Waktu sekarang adalah %d:%d:%d GMT \n",jamsekarang,menitSekarang,detikSekarang);
        System.out.printf("Waktu sekarang adalah %d:%d:%d WIB \n",jamWIB,menitSekarang,detikSekarang);
    }
}
