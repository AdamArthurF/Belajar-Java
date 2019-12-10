package mandiri;

public class Mandiri32UjiLingkaran2 {

    public static void main(String[] MbahPutih) {
        System.out.println("Sebelum menciptakan objek-objek");
        System.out.println("Jumlah objek lingkaran adalah " + Mandiri31Lingkaran2.jumlahObjek);

        Mandiri31Lingkaran2 lingkaran1 = new Mandiri31Lingkaran2();
        System.out.println("Setelah menciptakan lingkaran1");
        System.out.println("Lingkaran1: jari-jari (" + lingkaran1.jariJari + ") dan jumlah objek lingkaran adalah " + lingkaran1.jumlahObjek);

        Mandiri31Lingkaran2 lingkaran2 = new Mandiri31Lingkaran2();
        lingkaran1.jariJari = 100;
        System.out.println("Setelah menciptakan lingkaran2 dan memodifikasi lingkaran1");
        System.out.println("Lingkaran1: jari-jari (" + lingkaran1.jariJari + ") dan jumlah objek lingkaran adalah " + lingkaran1.jumlahObjek);
        System.out.println("Lingkaran2: jari-jari (" + lingkaran2.jariJari + ") dan jumlah objek lingkaran adalah " + lingkaran2.jumlahObjek);
    }
}
