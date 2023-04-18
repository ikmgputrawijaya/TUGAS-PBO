import java.util.ArrayList;

public class Menu {
    public int idMenu;
    public String namaMenu;
    public int hargaMenu;

    //Constructor kelas Menu
    public Menu(int idMenu, String namaMenu, int hargaMenu) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }

    ///Mengembalikan nilai dari atribut harga, nama ,dan id.
    public int getIdMenu() {
        return idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }
}
