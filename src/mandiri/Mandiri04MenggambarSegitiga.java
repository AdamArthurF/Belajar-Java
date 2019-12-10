package mandiri;

public class Mandiri04MenggambarSegitiga {

    public static void main(String[] MbahPutih) {
        int i,j;

        System.out.println("====== PERSEGI ======");
        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        System.out.println("====== SEGITIGA SIKU - SIKU (KIRI ATAS-BAWAH)=====");
        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                System.out.print("*  ");
                if (i + j == 8){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                System.out.print("*  ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        System.out.println("====== SEGITIGA SIKU-SIKU (KANAN ATAS-BAWAH)");
        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                if (i + j < 8){
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                if (i - j > 0){
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        System.out.println("====== SEGITIGA ======");

        for (i = 0;i < 9;i++){
            for (j = 0;j < 18;j++){
                if (i + j < 9 || j - i > 9){
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}