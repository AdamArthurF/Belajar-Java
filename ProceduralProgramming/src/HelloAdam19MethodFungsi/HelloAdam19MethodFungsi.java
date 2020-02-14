/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam19MethodFungsi;

public class HelloAdam19MethodFungsi {

    public static void main(String[] args) {

        System.out.println(simpel());
        FungsiVoid("Mantab");
        SelamatPagi("Adam");
       
        // y = (x + 2) * x

        int x,y;

        x = 5;
        y = hitung(x);
    
        System.out.println("x = " + x + ", maka y = " + y);
        
        x = 20;
        y = hitung(x);
    
        System.out.println("x = " + x + ", maka y = " + y);
        
        x = 40;
        y = hitung(x);
    
        System.out.println("x = " + x + ", maka y = " + y);
    }

    private static void SelamatPagi(String nama){
        System.out.println("Selamat Pagi " + nama);
    }

    // Fungsi atau method tanpa kembalian

    private static void FungsiVoid(String input){

        System.out.println(input);
    }

    /*
    Fungsi atau method dengan kembalian sehingga menggunakan
    return untuk mengembalikan nilainya
    */

    private static float simpel(){

        return 10.0f;
    }

    public static int hitung(int input){

        int hasil;
        hasil = (input + 2) * input;

        return hasil;
    }
}