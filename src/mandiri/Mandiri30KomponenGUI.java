package mandiri;

import javax.swing.*;

public class Mandiri30KomponenGUI {

    public static void main(String[] MbahPutih) {
        JButton tombolYA = new JButton("YA");
        JButton tombolBATAL = new JButton("BATAL");
        JLabel labelNama = new JLabel("Masukkan nama kamu : ");
        JTextField fieldNama = new JTextField("Ketikkan nama disini");
        JCheckBox cekTebal = new JCheckBox("Tebal");
        JCheckBox cekMiring = new JCheckBox("Miring");
        JRadioButton radioMerah = new JRadioButton("Merah");
        JRadioButton radioKuning = new JRadioButton("Kuning");
        JRadioButton radioHijau = new JRadioButton("Hijau");
        JComboBox pilihan = new JComboBox(new String[] {"Sangat Baik","Baik","Cukup","Kurang","Sangat Kurang"});

        JPanel panel = new JPanel();
        panel.add(tombolYA);
        panel.add(tombolBATAL);
        panel.add(labelNama);
        panel.add(fieldNama);
        panel.add(cekTebal);
        panel.add(cekMiring);
        panel.add(radioMerah);
        panel.add(radioKuning);
        panel.add(radioHijau);
        panel.add(pilihan);

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Jendela GUI aku ");
        frame.setSize(600,450);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
