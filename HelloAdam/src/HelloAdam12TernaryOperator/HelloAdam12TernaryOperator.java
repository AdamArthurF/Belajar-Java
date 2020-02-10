/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam12TernaryOperator;

import java.util.Scanner;

public class HelloAdam12TernaryOperator {

    public static void main(String[] args) {

    // Ternary Operator
        float input, x;
    
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai mu : ");
        input = inputUser.nextFloat();
        
    // Variable x = ekspresi? statement_true : statement_false
    
        x = (input == 10? (input * input) : (input/2));
        
    if (input == 10){
        x = input * input;
    } else{
        x = input/2;
    }

        System.out.println("Hasilnya " + x);
    }
    
}
