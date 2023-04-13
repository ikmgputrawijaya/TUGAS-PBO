import java.util.Scanner;
import java.util.ArrayList;

public class Admin {

    int pilihan1;

    private static Scanner input = new Scanner(System.in);

    public void pageAdmin(ArrayList<Restaurant>daftarRestoran) {


        int pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println("======================================================");
            System.out.println("|                    ADMIN PAGE                      |");
            System.out.println("======================================================");
            System.out.println("    1. Melihat Restaurant"                             );
            System.out.println("    2. Menambahkan Restaurant "                        );
            System.out.println("    3. Menghapus Restaurant"                           );
            System.out.println("    4. Kembali ke Log in"                              );
            System.out.println("======================================================");

            System.out.print("Masukkan pilihan Anda : ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                melihatRestaurant(daftarRestoran);
            } else if (pilihan == 2) {
                menambahRestaurant(daftarRestoran);
            } else if (pilihan == 3) {
                menghapusRestaurant(daftarRestoran);
            } else if (pilihan == 4) {
                kembaliLogin(daftarRestoran);
            } else {
                System.out.println("Input Anda tidak valid");
                System.out.println("'ulang' untuk mengulang dan 'tidak' untuk keluar");
                String pilihan1 = input.next();
                if (pilihan1.equalsIgnoreCase("tidak")) {
                    ulang = false;
                }
            }
//            System.out.println("Program berakhir.");
            input.nextLine();
        }
    }

    public void melihatRestaurant(ArrayList<Restaurant>daftarRestoran){
        System.out.println("======================================================");
        System.out.println("|                 DAFTAR RESTAURANT                  |");
        System.out.println("======================================================");

        if(daftarRestoran.isEmpty()){
            System.out.println("Tidak Ada Restoran yang Terdaftar");
        } else {
            for (int i=0; i<daftarRestoran.size(); i++){
                System.out.println("Restoran " + i+1);
                System.out.println("Nama: " + daftarRestoran.get(i).getNama());
                System.out.println("Alamat: " + daftarRestoran.get(i).getAlamat());
            }
        }
        input.nextLine();
    }


    public void menambahRestaurant(ArrayList<Restaurant>daftarRestoran ) {
        input.nextLine();
        System.out.println("======================================================");
        System.out.println("|                 TAMBAH RESTAURANT                  |");
        System.out.println("======================================================");
        System.out.print("Masukkan nama restaurant : ");
        String namaRestoran = input.nextLine();

        System.out.print("Masukkan alamat restaurant : ");
        String alamatRestoran = input.nextLine();
        Restaurant restaurants = new Restaurant(namaRestoran, alamatRestoran);
        daftarRestoran.add(restaurants);
        while (true){
            System.out.println("======================================================");
            System.out.println("|                     Tambahkan Menu                 |");
            System.out.println("======================================================");
            System.out.println("    1. Menambah makanan"                               );
            System.out.println("    2. Menambah minuman"                               );
            System.out.println("    3. Melihat Data Menu"                              );
            System.out.println("    4. Kembali ke Admin Page"                          );
            System.out.println("======================================================");

            System.out.println("Masukkan pilihan : ");
            pilihan1 = input.nextInt();

            if (pilihan1==1) {
                input.nextLine();
                System.out.println("Nama makanan : ");
                String namaMenu = input.nextLine();
                System.out.println("Harga makanan : ");
                int hargaMenu =input.nextInt();
                Menu daftarMenu = new Menu(namaMenu, hargaMenu);
                restaurants.tambahMakanan(daftarMenu);
            }else if (pilihan1==2){
                input.nextLine();
                System.out.println("Nama minuman : ");
                String namaMenu = input.nextLine();
                System.out.println("Harga minuman : ");
                int hargaMenu =input.nextInt();
                Menu daftarMenu = new Menu(namaMenu, hargaMenu);
                restaurants.tambahMinuman(daftarMenu);
            }else if (pilihan1==3) {
                ArrayList<Menu> tampilkanMenu = new ArrayList<Menu>();

                for (int i=0; i<daftarRestoran.size(); i++){
                    System.out.println("Menu " + i+1);
                    System.out.println("Nama: " + daftarRestoran.get(i).getNama());
                    System.out.println("Harga: " + daftarRestoran.get(i).get);
                }
            }else if(pilihan1 == 4){
                pageAdmin(daftarRestoran);
            }else {
                System.out.println("Masukkan pilihan dengan benar");

            }
        }

    }

    public void menghapusRestaurant(ArrayList<Restaurant> daftarRestoran) {
        System.out.println("======================================================");
        System.out.println("|                  HAPUS RESTAURANT                  |");
        System.out.println("======================================================");


        
        
        
    }

    public void kembaliLogin(ArrayList<Restaurant> daftarRestoran){
        Login logins = new Login();
        logins.login(daftarRestoran);
    }
}
