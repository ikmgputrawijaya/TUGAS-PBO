import java.util.ArrayList;

public class Menu {

    //Method untuk mengembalikan nilai dari atribut idMenu pada objek Menu
    public int getIdMenu() {
        return idMenu;
    }

    public int idMenu;
    public String namaMenu;
    public int hargaMenu;

    //Constructor kelas Menu
    public Menu(int idMenu, String namaMenu, int hargaMenu) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }

    ///Mengembalikan nilai dari atribut nama dan alamat.
    public String getNamaMenu() {
        return namaMenu;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }
}
