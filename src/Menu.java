import java.util.ArrayList;

public class Menu {
    public String namaMenu;

    public Menu(String namaMenu, int hargaMenu) {
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }

    public int hargaMenu;

    public String getNamaMenu() {
        return namaMenu;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }
}
