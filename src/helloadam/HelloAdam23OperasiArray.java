package helloadam;

import  java.util.Arrays;

public class HelloAdam23OperasiArray {

    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        //Merubah array menjadi string
        System.out.println("\n====== Merubah Array menjadi String ======\n");
            printArray(arrayAngka1);

        //Mengcopy array
        System.out.println("\n====== Mengcopy Array ======\n");
            int[] arrayAngka2 = new int[5];
                printArray(arrayAngka1);
                printArray(arrayAngka2);
            System.out.println("------ Mengcopy dengan loop");
                for(int i = 0;i < arrayAngka1.length;i++){
                    arrayAngka2[i] = arrayAngka1[i];
                }
                    printArray(arrayAngka1);
                        System.out.println("Address 1 = " + arrayAngka1);
                    printArray(arrayAngka2);
                        System.out.println("Address 2 = " + arrayAngka2);
            System.out.println("------ Mengcopy dengan copyOf");
                int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
                    printArray(arrayAngka1);
                        System.out.println("Address 1 = " + arrayAngka1);
                    printArray(arrayAngka3);
                        System.out.println("Address 3 = " + arrayAngka3);
            System.out.println("------ Mengcopy dengan copyOfRange");
                int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
                    printArray(arrayAngka1);
                        System.out.println("Address 1 = " + arrayAngka1);
                    printArray(arrayAngka4);
                        System.out.println("Address 4 = " + arrayAngka4);

        //Fill Array
        System.out.println("\n====== Fill Array ======\n");
            int[] arrayAngka5 = new int[10];
                printArray(arrayAngka5);
                    Arrays.fill(arrayAngka5,5);
                printArray(arrayAngka5);

        //Komparasi Array
        System.out.println("\n====== Komparasi Array ======\n");
            int[] arrayAngka6 = {1,2,3,4,5};
            int[] arrayAngka7 = {1,2,3,4,6};

            System.out.println("------ Membandingkan antara 2 buah array ");
                System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));
                if (Arrays.equals(arrayAngka6,arrayAngka7)){
                    System.out.println("Array ini sama");
                } else{
                    System.out.println("Array ini beda");
                }

            System.out.println("------ Mengecek mana array yang lebih besar");
                System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
            System.out.println("------ Mengecek mana index yang berbeda");
                System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        //Sort Array
        System.out.println("\n====== Sort Array ======\n");
            int[] arrayAngka8 = {1,3,4,6,9,5,7,2,8,0};
                printArray(arrayAngka8);
                    Arrays.sort(arrayAngka8);
                printArray(arrayAngka8);

        //Search Array
        System.out.println("\n====== Search Array ======\n");
            int angka = 3;
            int posisi = Arrays.binarySearch(arrayAngka8,angka);
                System.out.println("Angka " + angka + " ada di index " + posisi);

    }

    private static void printArray(int[] dataArray){
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}
