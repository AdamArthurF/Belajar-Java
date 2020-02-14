/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam17BreakContinueReturn;

public class HelloAdam17BreakContinueReturn {

    public static void main(String[] args) {
    // Break, cotntinue, dan return
        int a = 0;
        while (true){
            a++;
            if (a == 10){
                break;
                // Ini adalah keyword untuk memaksa keluar dari loop
            } else if (a == 5){
                continue;
                // Ini adalah keyword untuk memaksa memulai aksi dari awal
            } else if (a == 7){
                return;
            }
            System.out.println("Looping ke-" + a);
        }
        System.out.println("Akhir dari looping");
    }
}
