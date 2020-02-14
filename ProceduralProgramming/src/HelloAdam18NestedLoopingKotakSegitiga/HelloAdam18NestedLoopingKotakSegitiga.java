/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam18NestedLoopingKotakSegitiga;

public class HelloAdam18NestedLoopingKotakSegitiga {

    public static void main(String[] args) {

        // Looping bersarang

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if ((i + j) == 4){
                break;
                }
            }
        System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j){
                break;
                } else if((i + j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
