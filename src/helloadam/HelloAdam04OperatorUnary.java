
package helloadam;

public class HelloAdam04OperatorUnary {


    public static void main(String[] args) {
 
    //Operator Unary = operator yang dilakukan pada satu variable
        
        //Operator unary + dan -
            int angka = 1;
                System.out.printf("Unary '+', %d menjadi %d \n ",angka,+angka);
                System.out.printf("Unary '-', %d menjadi %d \n ",angka,-angka);
        
        //Unary decrement (++) dan Increment (--)
            int angka2 = 10;
                angka2++;
                System.out.println("Nilai dengan '++' menjadi = " + angka2);
        
            int angka3 = 20;
                angka3--;
                System.out.println("Nilai dengan '--' menjadi = " + angka3);
        
        int a = 5;
            System.out.printf("Nilai dengan '++' prefix menjadi = %d \n", ++a);
        int b = 10; 
            System.out.printf("Nilai dengan '++' postfix menjadi = %d \n", b++);
            System.out.printf("Nilai hasil dari postfix menjadi = %d \n",b);
        
        //Unary boolean dengan tanda '!' untuk negasi
        
            boolean Adam = true;
                System.out.println("Nilai boolean = " + Adam);
                System.out.println("Nilai boolean = " + !Adam);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}



