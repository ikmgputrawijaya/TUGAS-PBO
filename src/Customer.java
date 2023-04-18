import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private static  Scanner scanner = new Scanner(System.in);
    private Restaurant restaurant;

    //Method untuk menampilkan halaman menu untuk customer
    public void pageCustomer(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu) {

        ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Customer customers = new Customer();
        int pilihan;
        boolean ulang = true;

        while (ulang) {
            System.out.println("======================================================");
            System.out.println("|                   CUSTOMER PAGE                    |");
            System.out.println("======================================================");
            System.out.println("    1. Melihat Restaurant");
            System.out.println("    2. Buat Pesanan");
            System.out.println("    3. LihatPesanan");
            System.out.println("    4. Kembali ke Log in");
            System.out.println("======================================================");
            System.out.print("Masukkan pilihan Anda : ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                customers.lihatRestoran(daftarRestoran, daftarMenu, daftarPesanan);
            } else if (pilihan == 2) {
                customers.buatPesanan(daftarRestoran, daftarMenu, daftarPesanan);
            } else if (pilihan == 3) {
                customers.lihatPesanan(daftarRestoran, daftarMenu, daftarPesanan);
            } else if (pilihan == 4) {
                customers.kembaliLogin(daftarRestoran, daftarMenu, daftarPesanan);
            } else {
                System.out.println("Input Anda tidak valid");
                System.out.println("'ulang' untuk mengulang dan 'tidak' untuk keluar");
                String pilihan1 = input.next();
                if (pilihan1.equalsIgnoreCase("tidak")) {
                    ulang = false;
                }
            }
        }
        System.out.println("Program berakhir.");
    }


    //Melihat restaurant untuk customer
    private void lihatRestoran(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu, ArrayList<Pesanan> daftarPesanan){
        System.out.println("======================================================");
        System.out.println("|                 DAFTAR RESTAURANT                  |");
        System.out.println("======================================================");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pesanan> pesanans = new ArrayList<>();

        if(daftarRestoran.isEmpty()){
            System.out.println("Tidak Ada Restoran yang Terdaftar");
            System.out.println("Tekan enter untuk melanjutkan");
        } else {

            for (int i=0; i<daftarRestoran.size(); i++){
                System.out.println("Restoran " + (i+1));
                System.out.println("ID      : " + daftarRestoran.get(i).getIdRestoran());
                System.out.println("Nama    : " + daftarRestoran.get(i).getNama());
                System.out.println("Alamat  : " + daftarRestoran.get(i).getAlamat());
            }
        }
        System.out.println("Tekan enter untuk kembali ke halaman customer");
        scanner.nextLine();
    }


    //Method untuk membuat pesanan
    private void buatPesanan(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu, ArrayList<Pesanan> daftarPesanan){

        Fitur fiturs = new Fitur();

        // Memilih restoran
        System.out.println("======================================================");
        System.out.println("Pilih Restoran : ");
        for (Restaurant restoran : daftarRestoran) {
            System.out.println("ID Restaurant      : " + restoran.getIdRestoran());
            System.out.println("Nama Restaurant    : " + restoran.getNama());
            System.out.println("Alamat Restaurant  : " + restoran.getAlamat());
            System.out.println("");
        }
        System.out.print("Masukkan ID Restoran: ");
        int idRestoran = scanner.nextInt();
        scanner.nextLine();

        //Mencari restoran berdasarkan id
        restaurant = fiturs.cariRestaurant(idRestoran, daftarRestoran, daftarMenu);
        if (restaurant == null) {
            System.out.println("Restoran tidak ditemukan.");
            return;
        }

        //Menampilkan menu restoran yang dipilih
        System.out.println("======================================================");
        System.out.println("Menu Restoran " + restaurant.getNama() + ":");
        ArrayList<Menu> daftarMenuRestoran = restaurant.getDaftarMenu();
        for (Menu menu : daftarMenuRestoran) {
            System.out.println(menu.getIdMenu() + ". " + menu.getNamaMenu() + " - Rp " + menu.getHargaMenu());
        }

        //Memilih menu
        ArrayList<Pesanan> pesananList = new ArrayList<>();
        boolean Iya = true;
        while (Iya) {
            System.out.println("----------------------------------------");
            System.out.print("Pilih menu (ID Menu): ");
            int idMenu = scanner.nextInt();


            scanner.nextLine(); // membaca karakter \n setelah angka

            //Mencari menu berdasarkan id
            Menu menu = fiturs.mencariMenu(idMenu, daftarMenuRestoran);
            if (menu == null) {
                System.out.println("Menu tidak ditemukan.");
                continue;
            }

            //Memilih jumlah pesanan
            System.out.print("Jumlah pesanan : ");
            int jumlahPesanan = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Apakah Anda ingin memesan lagi?");
            System.out.println("'Iya' atau 'Tidak'");
            String pilihOrderLagi = scanner.next();
            Pesanan pesanan = new Pesanan(menu, jumlahPesanan);
            daftarPesanan.add(pesanan);

            if (pilihOrderLagi.equalsIgnoreCase("Tidak")) {
                Iya = false;


            }
        }
        //Memasukkan jarak rumah
        System.out.print("Jarak rumah : ");
        int jarakRumah = scanner.nextInt();
        scanner.nextLine();
    }


    //Method untuk melihat pesanan
    private void lihatPesanan(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu, ArrayList<Pesanan> daftarPesanan) {
        System.out.println("======================================================");
        System.out.println("|                    DAFTAR PESANAN                  |");
        System.out.println("======================================================");

        if(daftarPesanan.isEmpty()){
            System.out.println("Tidak Ada Pesanan yang Terdaftar");
        } else {
            for (int i=0; i<daftarPesanan.size(); i++){
                System.out.println("Pesanan " + (i+1));
                System.out.println("Nama Restoran    : " + daftarRestoran.get(i).getNama());
                System.out.println("Menu             : " + daftarPesanan.get(i).getMenu().getNamaMenu()+ " - Rp " + daftarPesanan.get(i).getMenu().getHargaMenu());
                System.out.println("Jumlah           : " + daftarRestoran.get(i).getJumlah());
                System.out.println("Jarak (dalam km) : " + daftarRestoran.get(i).getJarakRumah());
                System.out.println("Total Harga      : Rp " + daftarRestoran.get(i).getTotalHarga());
            }
        }
        System.out.println("Tekan enter untuk kembali ke halaman customer");
        scanner.nextLine();
    }


    //Method untuk kembali ke halaman login
    public void kembaliLogin(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu, ArrayList<Pesanan> daftarPesanan) {
        Login logins = new Login();
        logins.login(daftarRestoran, daftarMenu);
    }
}

