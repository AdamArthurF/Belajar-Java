/*
 * Copyright (c) 2020. Adam Arthur Faizal
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
