package mandiri;

public class Mandiri31Lingkaran2 {
    double jariJari;

    static int jumlahObjek = 0;

    Mandiri31Lingkaran2(){
        jariJari = 1.0;
        jumlahObjek++;
    }

    Mandiri31Lingkaran2(double jariJariBaru) {
        jariJari = jariJariBaru;
        jumlahObjek++;
    }

    static int getJumlahObjek(){
        return jumlahObjek;
    }

    double Luas(){
        return jariJari * jariJari * Math.PI;
    }
}