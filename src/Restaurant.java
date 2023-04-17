import java.util.ArrayList;
import java.util.UUID;

public class Restaurant {

        ArrayList<Menu> daftarMenu = new ArrayList<Menu>();

        public String nama;
        public String alamat;

    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    public int getIdRestoran() {
        return idRestoran;
    }

    public int idRestoran;


        public Restaurant(int idRestoran, String nama, String alamat) {
            this.idRestoran = idRestoran;
            this.nama = nama;
            this.alamat = alamat;
            this.daftarMenu = new ArrayList<>();
        }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
            return nama;
        }
    public String getAlamat() {
            return alamat;
        }


        public void tambahMenu (Menu menu) {
            daftarMenu.add(menu);
        }
}

