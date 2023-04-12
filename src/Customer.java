import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    public void pageCustomer() {
        Scanner input = new Scanner(System.in);

        int pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println("======================================================");
            System.out.println("|                   CUSTOMER PAGE                    |");
            System.out.println("======================================================");
            System.out.println("    1. Melihat Restaurant");
            System.out.println("    2. Buat Pesanan "     );
            System.out.println("    3. LihatPesanan"      );
            System.out.println("    4. Kembali ke Log in" );
            System.out.println("======================================================");

            System.out.print("Masukkan pilihan Anda : ");
            pilihan = input.nextInt();

            if (pilihan == 1) {

            } else if (pilihan == 2) {

            } else if (pilihan == 3) {

            } else if (pilihan == 4) {

            } else {
                System.out.println("Input Anda tidak valid");
                System.out.println("'ulang' untuk mengulang dan 'tidak' untuk keluar");
                String pilihan1 = input.next();
                if (pilihan1.equalsIgnoreCase("tidak")) {
                    ulang = false;
                }
            }
            System.out.println("Program berakhir.");
        }
    }
}
