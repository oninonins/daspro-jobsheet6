import java.util.Scanner;

public class Pemilihan2Percobaan205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("===== Menu KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("Masukan angka dari menu yang dipilih : ");
        int pilihan_menu = input05.nextInt();
        input05.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        String member = input05.nextLine();
        System.out.println("-------------------------------------");

        int harga ;
        double total_bayar, diskon ;
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu ==1) {
                harga = 14000; 
                System.out.println("Harga ricebowl = " + harga);
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling =" + harga);
            }else {
                System.out.println("Masukan pilihan menu dengan benar ");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            
        }else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000 ;
                System.out.println("Harga ricebowl = " + harga);
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling =" + harga);
            }else {
            System.out.println("Masukan pilihan menu dengan benar ");
            return;
            }
            System.out.println("Total bayar = " + harga);
        }else {
            System.out.println("member tidak valid ");
        }
       
    }    
}
