import java.util.Scanner;


public class Pemilihan2Percobaan105 {
    public static void main(String[] args) {
      Scanner input05 = new Scanner(System.in);

        
        int tahun ;
        System.out.print("Masukan Tahun : ");
        tahun = input05.nextInt();

       
        if ((tahun % 4) == 0) {
            if ((tahun % 100) !=0) {
                System.out.println("Tahun kabisat");
            }else {
            if (tahun % 400 == 0 ) {
                System.out.println("Tahun Kabisat");
            }else 
                System.out.println("bukan tahun kabisat");
            }
            
        }else 
            System.out.println("Bukan Tahun Kabisat");


    }
    
}