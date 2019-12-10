package mandiri;

public class Mandiri40Kalkulator {

    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Usage: java Kalkulator operand1 operator operand2");
            System.exit(0);
        }

        int hasil = 0;

        switch (args[1].charAt(0)){
            case '+' :
                hasil = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-' :
                hasil = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '*' :
                hasil = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '/' :
                hasil = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + hasil);
    }
}
