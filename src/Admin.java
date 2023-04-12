import java.util.Scanner;
import java.util.ArrayList;

public class Admin {

    public void pageAdmin() {
        Scanner input = new Scanner(System.in);

        int pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println("======================================================");
            System.out.println("|                    ADMIN PAGE                      |");
            System.out.println("======================================================");
            System.out.println("    1. Melihat Restaurant"      );
            System.out.println("    2. Menambahkan Restaurant " );
            System.out.println("    3. Menghapus Restaurant"    );
            System.out.println("    4. Kembali ke Log in"       );
            System.out.println("======================================================");

            System.out.print("Masukkan pilihan Anda : ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                melihatRestaurant(ArrayList<String> namaRestaurant, ArrayList<String> alamatRestaurant, ArrayList<String> menuRestaurant);
            } else if (pilihan == 2) {
                menambahRestaurant(ArrayList<String> namaRestaurant, ArrayList<String> alamatRestaurant, ArrayList<String> menuRestaurant);
            } else if (pilihan == 3) {

            } else if (pilihan == 4) {
                kembaliLogin();
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

    public void melihatRestaurant(ArrayList<String> namaRestaurant, ArrayList<String> alamatRestaurant, ArrayList<String> menuRestaurant){
        System.out.println("======================================================");
        System.out.println("|                 DAFTAR RESTAURANT                  |");
        System.out.println("======================================================");

        for (int i=0; i<namaRestaurant.size(); i++){
            System.out.println("Nama: " + namaRestaurant.get(i));
            System.out.println("Alamat: " + alamatRestaurant.get(i));
            System.out.println("Menu: " + menuRestaurant.get(i));
            System.out.println();
        }
    }


    public void menambahRestaurant(ArrayList<String> namaRestaurant, ArrayList<String> alamatRestaurant, ArrayList<String> menuRestaurant) {
        System.out.println("======================================================");
        System.out.println("|                 TAMBAH RESTAURANT                  |");
        System.out.println("======================================================");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama restaurant : ");
        String nama = input.nextLine();
        namaRestaurant.add(nama);

        System.out.print("Masukkan alamat restaurant : ");
        String alamat = input.nextLine();
        alamatRestaurant.add(alamat);

        System.out.print("Masukkan menu restaurant : ");
        String menu = input.nextLine();
        menuRestaurant.add(menu);
    }

    public void menghapusRestaurant() {
        System.out.println("======================================================");
        System.out.println("|                  HAPUS RESTAURANT                  |");
        System.out.println("======================================================");
    }

    public void kembaliLogin(){
        Login logins = new Login();
        logins.login();
    }
}
