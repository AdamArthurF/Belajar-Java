package helloadam;

import java.util.Scanner;

public class HelloAdam13LatihanKalkulatorIfElse {

    public static void main(String[] args) {
        // Membuat kalkulator
        // a, operator, b
            Scanner inputUser;
            float a,b,hasil;
            char operator;

            inputUser = new Scanner (System.in);

                System.out.print("Nilai a = ");
                    a = inputUser.nextFloat();
                System.out.print("Operator = ");
                    operator = inputUser.next().charAt(0);
                System.out.print("Nilai b = ");
                    b = inputUser.nextFloat();

                    System.out.println("Input user = " + a + " " + operator + " " + b);

        // Operator yang tersedia --> +, -, *, dan /

            if (operator == '+'){
                //Penjumlahan
                hasil = a + b;
                    System.out.println("Hasil = " + hasil);
                                } else if(operator == '-'){
                                        //Pengurangan
                                        hasil = a - b;
                                            System.out.println("Hasil = " + hasil);
                                } else if(operator == '*'){
                                        //Perkalian
                                        hasil = a * b;
                                            System.out.println("Hasil = " + hasil);
                                } else if(operator == '/'){
                                        //Pengurangan
                                        hasil = a / b;
                                            System.out.println("Hasil = " + hasil);
                                } else {
                                        System.out.println("Operator tidak ditemukan");
                                        }
    
    
    }






























    }
