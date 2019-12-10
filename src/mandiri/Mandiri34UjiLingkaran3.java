package mandiri;

public class Mandiri34UjiLingkaran3 {

    public static void main(String[] MbahPutih) {
        Mandiri33Lingkaran3 lingkaranku = new Mandiri33Lingkaran3();
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaranku.getJariJari() + " adalah " + lingkaranku.Luas());

        lingkaranku.tetapkanJari(lingkaranku.getJariJari() * 100);
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaranku.getJariJari() + " adalah " + lingkaranku.Luas());

        System.out.println("Jumlah objek yang diciptakan adalah " + lingkaranku.jumlahObjek());
    }
}