package mandiri;

public class Mandiri27UjiLingkaran {

    public static void main(String[] MbahPutih) {
        Lingkaran1 lingkaran1 = new Lingkaran1 ();
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran1.jariJari + "cm adalah " + lingkaran1.Luas() + "cm");

        Lingkaran1 lingkaran2 = new Lingkaran1 (25);
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran2.jariJari + "cm adalah " + lingkaran2.Luas() + "cm");

        Lingkaran1 lingkaran3 = new Lingkaran1(125);
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran3.jariJari + "cm adalah " + lingkaran3.Luas() + "cm");

        lingkaran1.jariJari = 500;
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran1.jariJari + "cm adalah " + lingkaran1.Luas() + "cm");
    }
}

class Lingkaran1 {
    double jariJari;
    Lingkaran1(){
        jariJari = 1.0;
    }

    Lingkaran1(double radiusBaru) {
        jariJari = radiusBaru;
    }

    double Luas(){
        return jariJari * jariJari * Math.PI;
    }
}