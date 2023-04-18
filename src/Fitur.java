import java.util.ArrayList;
import java.util.Random;

public class Fitur {

    //Method untuk mencari objek Restaurant dengan id tertentu dari daftar Restaurant yang ada di dalam ArrayList daftarRestoran
    public Restaurant cariRestaurant(int id, ArrayList<Restaurant> daftarRestoran , ArrayList<Menu> daftarMenu) {
        for (Restaurant restaurant :daftarRestoran) {
            if (restaurant.getIdRestoran() == id) {
                return restaurant;
            }
        }
        return null;
    }
    //Method untuk mencari objek Menu dengan id tertentu dari daftar Menu yang ada di dalam ArrayList daftarMenu
    public Menu mencariMenu(int id, ArrayList<Menu> daftarMenu) {
        for (Menu menu : daftarMenu) {
            if (menu.getIdMenu() == id) {
                return menu;
            }
        }
        return null;
    }
}

