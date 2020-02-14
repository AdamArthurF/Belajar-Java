/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam11SwitchCase;

import java.util.Scanner;

public class HelloAdam11SwitchCase {

    public static void main(String[] args) {

        // Switch Case
        String input;
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Panggil nama : ");
        input = inputUser.next();
        
        // Ekspresinya berupa satuan (int, long, byte, short), String, atau enum) 
        
        switch(input){
            case "Adam":
                System.out.println("Saya Adam dan hadir bos!!!");
                break;

            case "Arthur":
                System.out.println("Saya Arthur dan hadir bos!!!");
                break;
                    
            default:
                System.out.println(input + " tidak hadir bos!!!");
                break;
        }
        System.out.println("Program selesai");
    }
}