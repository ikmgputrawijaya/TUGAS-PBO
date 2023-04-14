import java.util.Scanner;
import java.util.ArrayList;

public class Admin {

    int pilihan1;

    private static Scanner input = new Scanner(System.in);

    public void pageAdmin(ArrayList<Restaurant>daftarRestoran, ArrayList<Menu> daftarMenu) {
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
//            System.out.println("Program berakhir.");
            input.nextLine();
        }
    }

    public void melihatRestaurant(ArrayList<Restaurant>daftarRestoran, ArrayList<Menu> daftarMenu){
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


    public void menambahRestaurant(ArrayList<Restaurant>daftarRestoran,ArrayList<Menu> daftarMenu ) {
        input.nextLine();
        System.out.println("======================================================");
        System.out.println("|                 TAMBAH RESTAURANT                  |");
        System.out.println("======================================================");

        System.out.print("Masukkan id restaurant : ");
        int idRestoran = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan nama restaurant : ");
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

            if (pilihan1==1) {
                input.nextLine();

                if(daftarRestoran.isEmpty()){
                    System.out.println("Tidak Ada Restoran yang Terdaftar");
                }
                for (int i=0; i<daftarRestoran.size(); i++){
                    System.out.println("Restoran " + daftarRestoran.get(i).getIdRestoran());
                    System.out.println("Nama: " + daftarRestoran.get(i).getNama());
                    System.out.println("Alamat: " + daftarRestoran.get(i).getAlamat());
                }
                System.out.print("Pilih restaurant yang akan di tambahkan menu : ");
                int pilih = input.nextInt();

                fiturs.cariRestaurant(pilih, daftarRestoran, daftarMenu);
                input.nextLine();

                System.out.print("Masukan id menu : ");
                int idMenu = input.nextInt();

                input.nextLine();

                System.out.print("Nama menu : ");
                String namaMenu = input.nextLine();

                System.out.print("Harga menu : ");
                int hargaMenu =input.nextInt();

                Menu daftarsMenu = new Menu(idMenu, namaMenu, hargaMenu);
                restaurants.daftarMenu.add(daftarsMenu);

                System.out.println("Menu berhasil ditambahkan");



            }else if (pilihan1==2) {
                if(daftarRestoran.isEmpty()){
                    System.out.println("Tidak Ada Menu yang Terdaftar");
                }
                for (int i = 0; i < daftarRestoran.size(); i++){
                    System.out.println("Restoran " + daftarRestoran.get(i).getIdRestoran());
                    System.out.println("Nama Restoran : " + daftarRestoran.get(i).getNama());
                }
                System.out.print("Pilih restaurant yang akan dilihat menunya : ");
                int pilih = input.nextInt();

                if(daftarMenu.isEmpty()) {
                    System.out.println("Tidak Ada Restoran yang Terdaftar");
                }
                Restaurant restaurant = fiturs.cariRestaurant(pilih, daftarRestoran, daftarMenu);
                ArrayList<Menu> menuRestaurant = restaurant.getDaftarMenu();
                for(Menu item : menuRestaurant){
                    System.out.println("ID Menu " + item.idMenu);
                    System.out.println("Nama: "+ item.namaMenu);
                    System.out.println("Harga: " + item.hargaMenu);
                }

            }else if(pilihan1 == 3){
                pageAdmin(daftarRestoran, daftarMenu);
            }else {
                System.out.println("Masukkan pilihan dengan benar");
            }
        }

    }

    public void menghapusRestaurant(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu) {
        System.out.println("======================================================");
        System.out.println("|                  HAPUS RESTAURANT                  |");
        System.out.println("======================================================");

        if(daftarRestoran.isEmpty()){
            System.out.println("Tidak Ada Restoran yang Terdaftar");
        } else {
            for (int i=0; i<daftarRestoran.size(); i++){
                System.out.println("Restoran " + daftarRestoran.get(i).getIdRestoran());
                System.out.println("Nama   : " + daftarRestoran.get(i).getNama());
                System.out.println("Alamat : " + daftarRestoran.get(i).getAlamat());
            }
        }

        System.out.print("Masukkan nomor restaurant yang ingin dihapus : ");
        int nomor = input.nextInt();
        if(nomor < 1 || nomor > daftarRestoran.size()){
            System.out.println("Nomor restaurant tidak valid.");
        } else {
            daftarRestoran.remove(nomor-1);
            System.out.println("Restoran berhasil dihapus.");
        }
    }

    public void kembaliLogin(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu){
        Login logins = new Login();
        logins.login(daftarRestoran, daftarMenu);
    }
}
