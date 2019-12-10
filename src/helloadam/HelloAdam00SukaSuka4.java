package helloadam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HelloAdam00SukaSuka4 {

    public static void main(String[] args) throws IOException {

        FileInputStream inputFile = new FileInputStream("input2.txt");

        System.out.println((char)inputFile.read());

        System.out.println("akhir dari program");

    }
}
