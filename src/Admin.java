import java.util.Scanner;
import java.util.ArrayList;

public class Admin {

    int pilihan1;

    //Deklarasi sebuah objek Scanner dengan nama variabel input
    private static Scanner input = new Scanner(System.in);

    //Method untuk menampilkan halaman menu untuk admin
    public void pageAdmin(ArrayList<Restaurant>daftarRestoran, ArrayList<Menu> daftarMenu) {

        int pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println("=========================================================");
            System.out.println("|                    ADMIN PAGE                         |");
            System.out.println("=========================================================");
            System.out.println("    1. Melihat Restaurant"                                );
            System.out.println("    2. Menambahkan Restaurant sekaligus menambahkan menu" );
            System.out.println("    3. Menghapus Restaurant"                              );
            System.out.println("    4. Kembali ke Log in"                                 );
            System.out.println("=========================================================");

            System.out.print("Masukkan pilihan Anda : ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                melihatRestaurant(daftarRestoran, daftarMenu);
            } else if (pilihan == 2) {
                menambahRestaurant(daftarRestoran, daftarMenu);
            } else if (pilihan == 3) {
                menghapusRestaurant(daftarRestoran, daftarMenu);
            } else if (pilihan == 4) {
                kembaliLogin(daftarRestoran, daftarMenu);
            } else {
                System.out.println("Input Anda tidak valid");
                System.out.println("'ulang' untuk mengulang dan 'tidak' untuk keluar");
                String pilihan1 = input.next();
                if (pilihan1.equalsIgnoreCase("tidak")) {
                    ulang = false;
                }
            }
            input.nextLine();
        }
    }

    //Method untuk melihat restaurant
    public void melihatRestaurant(ArrayList<Restaurant>daftarRestoran, ArrayList<Menu> daftarMenu){
        System.out.println("======================================================");
        System.out.println("|                 DAFTAR RESTAURANT                  |");
        System.out.println("======================================================");

        //If else untuk menampilkan data restaurant jika ada, apabila tidak ada akan muncul output "Tidak Ada Restoran yang Terdaftar"
        if(daftarRestoran.isEmpty()){
            System.out.println("Tidak Ada Restoran yang Terdaftar");
            System.out.println("Tekan enter untuk melanjutkan");
        } else {
            for (int i=0; i<daftarRestoran.size(); i++){
                System.out.println("Restoran  " + (i+1));
                System.out.println("ID       : " + daftarRestoran.get(i).getIdRestoran());
                System.out.println("Nama     : " + daftarRestoran.get(i).getNama());
                System.out.println("Alamat   : " + daftarRestoran.get(i).getAlamat());

                ArrayList<Menu> menuRestoran = new ArrayList<>();
                for (int j = 0; j < daftarMenu.size(); j++) {
                    if (daftarMenu.get(j).getIdMenu() == daftarRestoran.get(i).getIdRestoran()) {
                        menuRestoran.add(daftarMenu.get(j));
                    }
                }

                // Tampilkan menu yang terkait dengan restoran saat ini
                if (menuRestoran.isEmpty()) {
                    System.out.println("Tidak Ada Menu yang Tersedia");
                } else {
                    System.out.println("Menu:");
                    for (int j = 0; j < menuRestoran.size(); j++) {
                        System.out.println("- " + menuRestoran.get(j).getNamaMenu() + " (" + menuRestoran.get(j).getHargaMenu() + ")");
                    }
                }
            }
        }
        input.nextLine();
    }

    //Method untuk menambah restaurant
    public void menambahRestaurant(ArrayList<Restaurant>daftarRestoran,ArrayList<Menu> daftarMenu ) {
        input.nextLine();
        System.out.println("======================================================");
        System.out.println("|                 TAMBAH RESTAURANT                  |");
        System.out.println("======================================================");

        System.out.print("Masukkan id restaurant     : ");
        int idRestoran = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan nama restaurant   : ");
        String namaRestoran = input.nextLine();

        System.out.print("Masukkan alamat restaurant : ");
        String alamatRestoran = input.nextLine();

        Fitur fiturs = new Fitur();
        Restaurant restaurants = new Restaurant(idRestoran,namaRestoran, alamatRestoran);
        daftarRestoran.add(restaurants);

        while (true){
            System.out.println("======================================================");
            System.out.println("|                   Tambahkan Menu                   |");
            System.out.println("======================================================");
            System.out.println("    1. Menambah menu"                                  );
            System.out.println("    2. Melihat Data Menu"                              );
            System.out.println("    3. Kembali ke Admin Page"                          );
            System.out.println("======================================================");

            System.out.print("Masukkan pilihan : ");
            pilihan1 = input.nextInt();
            System.out.println("======================================================");

            //Menambah menu
            if (pilihan1==1) {
                input.nextLine();
                for (int i=0; i<daftarRestoran.size(); i++){
                    System.out.println("ID Restoran " + daftarRestoran.get(i).getIdRestoran());
                    System.out.println("Nama      : " + daftarRestoran.get(i).getNama());
                    System.out.println("Alamat    : " + daftarRestoran.get(i).getAlamat());
                }
                System.out.print("Pilih restaurant yang akan di tambahkan menu : ");
                int pilih = input.nextInt();

                fiturs.cariRestaurant(pilih, daftarRestoran, daftarMenu);
                input.nextLine();

                System.out.print("Masukan id menu : ");
                int idMenu = input.nextInt();

                input.nextLine();

                System.out.print("Nama menu       : ");
                String namaMenu = input.nextLine();

                System.out.print("Harga menu      : ");
                int hargaMenu =input.nextInt();

                Menu daftarsMenu = new Menu(idMenu, namaMenu, hargaMenu);
                restaurants.tambahMenu(daftarsMenu);

                System.out.println("Menu berhasil ditambahkan");

                //Melihat menu
            }else if (pilihan1==2) {
                if(daftarRestoran.isEmpty()){
                    System.out.println("Tidak Ada Menu yang Terdaftar");
                }
                for (int i = 0; i < daftarRestoran.size(); i++){
                    System.out.println("ID Restoran   " + daftarRestoran.get(i).getIdRestoran());
                    System.out.println("Nama Restoran : " + daftarRestoran.get(i).getNama());
                }
                System.out.print("Pilih restaurant yang akan dilihat menunya : ");
                int pilih = input.nextInt();

                Restaurant restaurant = fiturs.cariRestaurant(pilih, daftarRestoran, daftarMenu);
                ArrayList<Menu> menuRestaurant = restaurant.getDaftarMenu();
                for(Menu item : menuRestaurant){
                    System.out.println("ID Menu   " + item.idMenu);
                    System.out.println("Nama     : "+ item.namaMenu);
                    System.out.println("Harga    : Rp " + item.hargaMenu);
                }

                //Kembali ke menu admin
            }else if(pilihan1 == 3){
                pageAdmin(daftarRestoran, daftarMenu);
            }else {
                System.out.println("Masukkan pilihan dengan benar");
            }
        }

    }

    //Method untuk menghapus restaurant
    public void menghapusRestaurant(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu) {
        System.out.println("======================================================");
        System.out.println("|                  HAPUS RESTAURANT                  |");
        System.out.println("======================================================");


        if(daftarRestoran.isEmpty()){
            System.out.println("Tidak Ada Restoran yang Terdaftar");
        } else {
            for (int i=0; i<daftarRestoran.size(); i++){
                System.out.println("ID Restoran " + daftarRestoran.get(i).getIdRestoran());
                System.out.println("Nama   : " + daftarRestoran.get(i).getNama());
                System.out.println("Alamat : " + daftarRestoran.get(i).getAlamat());
            }
        }
        System.out.print("Masukkan ID restaurant yang ingin dihapus : ");
        int IdRestoran = input.nextInt();
        boolean found = false;
        for (int i = 0; i < daftarRestoran.size(); i++) {
            if (daftarRestoran.get(i).getIdRestoran() == IdRestoran) {
                daftarRestoran.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Restoran berhasil dihapus.");
        } else {
            System.out.println("Restoran dengan ID tersebut tidak ditemukan.");
        }
    }

    //Method untuk kembali ke halaman login
    public void kembaliLogin(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu){
        Login logins = new Login();
        logins.login(daftarRestoran, daftarMenu);
    }
}
