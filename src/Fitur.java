import java.util.ArrayList;
import java.util.Random;

public class Fitur {
    public Restaurant cariRestaurant(int id, ArrayList<Restaurant> daftarRestoran , ArrayList<Menu> daftarMenu) {
        for (Restaurant restaurant :daftarRestoran) {
            if (restaurant.getIdRestoran() == id) {
                return restaurant;
            }
        }
        return null;
    }
}
