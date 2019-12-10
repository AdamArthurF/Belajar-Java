package helloadam;

public class HelloAdam21OverloadMethod {

    public static void main(String[] args) {
        int hasilInteger;
            hasilInteger = tambah(4,5);
            hasilInteger = tambah(1,2,3);
        float hasilFloat;
            hasilFloat = tambah(4.5f,4);
            hasilFloat = tambah(4,4.5f);
        
        printAngka(10);
        printAngka(20);
        printAngka(10.5f);
        printAngka(12.3d);
        
    }
    
    private static int tambah(int angkaInt1,int angkaInt2,int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
    
    private static float tambah(int angkaInt2,float angkaFloat1){
        return angkaFloat1 + angkaInt2;
    }
    
    private static float tambah(float angkaFloat1,int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }
    
    private static int tambah(int angkaInt1,int angkaInt2){
        return angkaInt1 + angkaInt2;
    }
    
    private static void printAngka(double angkaDouble){
        System.out.println("Ini adalah double dengan nilai = " + angkaDouble);
    }
    
    private static void printAngka(float angkaFloat){
        System.out.println("Ini adalah float dengan nilai = " + angkaFloat);
    }
    
}
