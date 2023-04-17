import java.util.ArrayList;

public class Restaurant {
        //Menyimpan data Menu
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

        //Constructor class Restaurant
        public Restaurant(int idRestoran, String nama, String alamat) {
            this.idRestoran = idRestoran;
            this.nama = nama;
            this.alamat = alamat;
            this.daftarMenu = new ArrayList<>();
        }


    //Mengubah nilai atribut dengan nilai parameter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //Mengembalikan nilai dari atribut nama dan alamat
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

