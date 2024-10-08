import java.util.Scanner;


public class Pemilihan2Percobaan105 {
    public static void main(String[] args) {
      Scanner input05 = new Scanner(System.in);

        
        int tahun ;
        System.out.print("Masukan Tahun : ");
        tahun = input05.nextInt();

       
        if ((tahun % 4) == 0) {
            if ((tahun % 100) !=0 && tahun % 400 == 0) {
                System.out.println(tahun + "Tahun kabisat" );
            }else {
                System.out.println(tahun + "Bukan tahun kabisat");
            }
        }
        else{
            System.out.println(tahun + "bukan tahun kabisat");
        }
        
            
            
            
        


    }
    
}