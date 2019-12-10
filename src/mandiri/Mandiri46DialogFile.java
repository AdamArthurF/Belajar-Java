package mandiri;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Mandiri46DialogFile {

    public static void main(String[] MbahPutih) throws Exception{
        JFileChooser pemilihFile = new JFileChooser();
        if (pemilihFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = pemilihFile.getSelectedFile();
            Scanner masukan = new Scanner(file);

            while (masukan.hasNext()) {
                System.out.println(masukan.nextLine());
            }

            masukan.close();
        } else {
            System.out.println("Tidak ada file yang dipilih");
        }
    }
}