package mandiri;

import javax.swing.*;

public class Mandiri14NilaiSentinel {

    public static void main(String[] MbahPutih) {
        int jumlah,opsi,data;
        String dataString;
        jumlah = 0;

        opsi = JOptionPane.YES_OPTION;
        while (opsi == JOptionPane.YES_OPTION) {
            dataString = JOptionPane.showInputDialog(null,"Masukkan suatu nilai integer = ","Kotak dialog",JOptionPane.INFORMATION_MESSAGE);
            data = Integer.parseInt(dataString);

            jumlah += data;
            opsi = JOptionPane.showConfirmDialog(null,"Mau lanjut engga? ","Kotak dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        }
        JOptionPane.showMessageDialog(null,"Wah ternyata jumlah nya adalah " + jumlah);
    }
}
