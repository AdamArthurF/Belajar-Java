package helloadam;

public class HelloAdam16BreakContinueReturn {

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
