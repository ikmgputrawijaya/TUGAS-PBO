import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Menyimpan data restaurant
        ArrayList<Restaurant> daftarRestoran = new ArrayList<Restaurant>();
        //Menyimpan data menu
        ArrayList<Menu> daftarMenu = new ArrayList<Menu>();
        //Menyimpan data pesanan
        ArrayList<Pesanan> daftarPesanan = new ArrayList<Pesanan>();

        //Membuat objek logins dari kelas Login
        Login logins = new Login();
        //Memanggil metode login
        logins.login(daftarRestoran, daftarMenu, daftarPesanan);
    }
}
