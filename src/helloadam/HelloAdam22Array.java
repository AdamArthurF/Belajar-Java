package helloadam;

import java.util.Arrays;

public class HelloAdam22Array {

    public static void main(String[] args) {
    // Assignment
    // tipedata[] nama = {komponen-komponen}

        System.out.println("====== ASSIGNMENT ARRAY ======");

        //           indeks = 0 1 2 3
        //                    | | | |
        int[] arrayInteger = {1,2,3,4};

            System.out.println(arrayInteger[0]);
            System.out.println(arrayInteger[1]);
            System.out.println(arrayInteger[2]);
            System.out.println(arrayInteger[3]);

            System.out.println(Arrays.toString(arrayInteger));
            
    // Deklarasi
    // tipedata[] nama = new tipedata[jumlahArray];

        System.out.println("====== DEKLARASI ARRAY ======");            
            float[] arrayFloat = new float[5];
            
            arrayFloat[0] = 1f;
            arrayFloat[1] = 2f;
            arrayFloat[2] = 3f;
            arrayFloat[3] = 4f;
            arrayFloat[4] = 5f;
            
                System.out.println(arrayFloat[0]);
                System.out.println(arrayFloat[1]);
                System.out.println(arrayFloat[2]);
                System.out.println(arrayFloat[3]);   
                System.out.println(arrayFloat[4]);
                
                System.out.println(Arrays.toString(arrayFloat));
                
        System.out.println("====== LOOPING PADA ARRAY ======");
            
            int[] arrayAngka2 = {1,2,3,4,5,6,7,8,9,10};
            
            // Looping standard
            System.out.println("----- LOOPING STANDARD");
            for(int i = 0; i < 10;i++){
                System.out.println("Index ke-" + i + " adalah " + arrayAngka2[i]);
            }
            
            // Looping dengan properti array
            System.out.println("----- LOOPING DENGAN PROPERTI LENGTH");
            for(int i = 0;i < arrayAngka2.length;i++){
                System.out.println("Index ke-" + i + " adalah " + arrayAngka2[i]);
            }
            
            //Looping khususon untuk collection <-- array
            System.out.println("----- LOOPING FOR EACH");        
            for(int angka : arrayAngka2){
                System.out.println("Angka pada looping ini adalah " + angka);
            }
    }
}    
    
    
    
    
    
    
    
    

    
    
    
    
    
    

