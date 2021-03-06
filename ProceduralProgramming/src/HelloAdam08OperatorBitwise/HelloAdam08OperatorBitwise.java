/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam08OperatorBitwise;

public class HelloAdam08OperatorBitwise {

    public static void main(String[] MbahPutih) {

         // Operator Bitwise --> Operator untuk melakukan operasi pada nilai bit
         byte a,b,c;
         String a_bits,b_bits,c_bits;

         //Operator SHIFT LEFT
         System.out.println("===== SHIFT LEFT (<<) =====");
         a = 3;
         a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
         System.out.printf("%s = %d \n", a_bits, a);
         b = (byte)(a << 2);
         b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
         System.out.printf("%s = %d \n", b_bits, b);


         //Operator SHIFT RIGHT
         System.out.println("===== SHIFT RIGHT (>>) =====");
         a = 24;
         a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
         System.out.printf("%s = %d \n", a_bits, a);
         b = (byte)(a >> 2);
         b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
         System.out.printf("%s = %d \n", b_bits, b);

         //Operator bitwise OR
         System.out.println("===== BITWISE OR (|) =====");
         a = 24;
         a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
         System.out.printf("%s = %d \n",a_bits,a);
         b = 12;
         b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
         System.out.printf("%s = %d \n",b_bits,b);
         c = (byte)(a | b);
         c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
         System.out.printf("%s = %d \n",c_bits,c);

         //Operator Negasi/Not
         System.out.println("===== BITWISE NOT (~) =====");
         a = 24;
         b = (byte)(~a);
         a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
         System.out.printf("%s = %d \n",a_bits,a);
         b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
         System.out.printf("%s = %d \n",b_bits,b);
    }
}
