package mandiri;

import java.io.*;

public class Mandiri43TulisData {

    public static void main(String[] MbahPutih) throws Exception {
        File file = new File("MbahPutih.txt");
        if (file.exists()) {
            System.out.println("File sudah ada");
            System.exit(0);
        }

        PrintWriter keluaran = new PrintWriter(file);
        keluaran.print("Adam Arthur Faizal ");
        keluaran.println(17);
        keluaran.print("Mbah Putih Mulyosugito ");
        keluaran.println(71);

        keluaran.close();
    }
}
