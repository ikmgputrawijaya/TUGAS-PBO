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
}
