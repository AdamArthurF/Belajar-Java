package helloadam;

public class HelloAdam03KonversiTipeData {

    public static void main(String[] MbahPutih) {
   
        //Program untuk konversi tipe data
        int NilaiInt = 20; //32bit
            System.out.println("Nilai Integer = " + NilaiInt);
    
        //Memperluas rentang ke tipe data yang lebih besar
        long NilaiLong = NilaiInt;
            System.out.println("Nilai Long = " + NilaiLong);
        
        //Memperkecil rentang ke tipe data yang lebih kecil
        byte NilaiByte = (byte)NilaiInt;
            System.out.println("Nilai Byte = " + NilaiByte);
        
        //Casting pembagian
        int a,b;
        a = 12;
        b = 13;
        float c = (float) a / b;
            System.out.printf("%d / %d = %f \n",a,b,c);
        
        
    }
}




