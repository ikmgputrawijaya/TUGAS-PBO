import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    //Deklarasi variabel pesananArrayList sebagai ArrayList yang berisi objek Pesanan
    private static ArrayList<Pesanan> pesananArrayList;

    //Method untuk menampilkan halaman menu untuk customer
    public void pageCustomer(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu) {
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
                customers.lihatRestoran(daftarRestoran, daftarMenu);
            } else if (pilihan == 2) {
                customers.buatPesanan(daftarRestoran, daftarMenu);
            } else if (pilihan == 3) {
                customers.lihatPesanan(daftarRestoran, daftarMenu);
            } else if (pilihan == 4) {
                customers.kembaliLogin(daftarRestoran, daftarMenu);
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
    private void lihatRestoran(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu) {
        System.out.println("======================================================");
        System.out.println("|                 DAFTAR RESTAURANT                  |");
        System.out.println("======================================================");
        Scanner scanner = new Scanner(System.in);
        if(daftarRestoran.isEmpty()){
            System.out.println("Tidak Ada Restoran yang Terdaftar");
        } else {

            for (int i=0; i<daftarRestoran.size(); i++){
                System.out.println("Restoran " + i+1);
                System.out.println("Nama: " + daftarRestoran.get(i).getNama());
                System.out.println("Alamat: " + daftarRestoran.get(i).getAlamat());
            }
        }
        scanner.nextLine();
    }


    //Method untuk membuat pesanan
    private void buatPesanan(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu) {
        if(daftarMenu.isEmpty()){
            System.out.println("Tidak Ada Menu yang Terdaftar");
        } else {
            Scanner scanner = new Scanner(System.in);
            for (int i=0; i<daftarMenu.size(); i++){
                System.out.println("Menu " + i+1);
                System.out.println("Nama Menu: " + daftarMenu.get(i).getNamaMenu());
                System.out.println("Harga Menu: " + daftarMenu.get(i).getHargaMenu());
            }
        }
       // scanner.nextLine();
    }


    //Method untuk melihat pesanan
    private void lihatPesanan(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu) {
    }


    //Method untuk kembali ke halaman login
    public void kembaliLogin(ArrayList<Restaurant> daftarRestoran, ArrayList<Menu> daftarMenu) {
        Login logins = new Login();
        logins.login(daftarRestoran, daftarMenu);
    }
}

