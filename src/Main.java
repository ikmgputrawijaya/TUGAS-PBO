import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurant> daftarRestoran = new ArrayList<Restaurant>();
        ArrayList<Menu> daftarMenu = new ArrayList<Menu>();
        Login logins = new Login();
        logins.login(daftarRestoran, daftarMenu);
    }
}