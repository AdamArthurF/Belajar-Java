package mandiri;

public class Mandiri36TotalLuas {

    public static void main(String[] MbahPutih) {
        Mandiri33Lingkaran3[] arrayLingkaran;

        arrayLingkaran = ciptaArrayLingkaran();

        tampilArrayLingkaran(arrayLingkaran);
    }

    public static Mandiri33Lingkaran3[] ciptaArrayLingkaran() {
        Mandiri33Lingkaran3[] arrayLingkaran = new Mandiri33Lingkaran3[5];

        for (int i = 0;i < arrayLingkaran.length;i++) {
            arrayLingkaran[i] = new Mandiri33Lingkaran3(Math.random() * 100);
        }
        return arrayLingkaran;
    }

    public static void tampilArrayLingkaran(Mandiri33Lingkaran3[] arrayLingkaran) {
        System.out.printf("%-30s%-15s \n","JARI-JARI","LUAS");

        for (int i = 0;i < arrayLingkaran.length;i++) {
            System.out.printf("%-30f%-15f \n",arrayLingkaran[i].getJariJari(),arrayLingkaran[i].Luas());
        }
        System.out.println("_________________________________________________");

        System.out.printf("%-30s%-15f \n","Total luas lingkaran adalah ",jumlah(arrayLingkaran));
    }

    public static double jumlah(Mandiri33Lingkaran3[] arrayLingkaran) {
        double jumlah = 0;

        for (int i = 0;i < arrayLingkaran.length;i++) {
            jumlah += arrayLingkaran[i].Luas();
        }
        return jumlah;
    }
}