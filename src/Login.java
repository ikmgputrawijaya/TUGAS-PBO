import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void login(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu) {
        Scanner input = new Scanner(System.in);
        String username, password;
        boolean ulang = true;

        Admin admin1 = new Admin();
        Customer customer1 = new Customer();

        String usAdmin = "sayaadmin", pwAdmin = "12345";
        String usCustomer = "sayacustomer", pwCustomer = "12345";

        while (ulang) {

            System.out.println("======================================================");
            System.out.println("|                HALO, SELAMAT DATANG                |");
            System.out.println("|           SILAKAN LOG IN TERLEBIH DAHULU           |");
            System.out.println("======================================================");
            System.out.print("    Masukkan username : ");
            username = input.nextLine();
            System.out.print("    Masukkan password : ");
            password = input.nextLine();
            System.out.println("======================================================");

            if (username.equals(usAdmin) && password.equals(pwAdmin)) {
                admin1.pageAdmin(daftarRestoran, daftarMenu);
            } else if (username.equals(usCustomer) && password.equals(pwCustomer)) {
                customer1.pageCustomer(daftarRestoran, daftarMenu);
            } else {
                System.out.println("Password tidak sesuai");
                System.out.println("Apakah Anda ingin mengulang login? : ");
                System.out.println("'ulang' untuk mengulang dan 'tidak' untuk keluar");
                String pilihan = input.next();
                if (pilihan.equalsIgnoreCase("tidak")) {
                    ulang = false;
                }
            }
            System.out.println("Program berakhir.");
        }
    }
}