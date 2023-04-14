import java.util.ArrayList;

public class Menu {
    public int getIdMenu() {
        return idMenu;
    }

    public int idMenu;
    public String namaMenu;
    public int hargaMenu;

    public Menu(int idMenu, String namaMenu, int hargaMenu) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }
}
