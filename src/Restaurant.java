import java.util.ArrayList;

public class Restaurant {
        ArrayList<Menu> daftarRestoran = new ArrayList<Menu>();
        ArrayList<Menu> daftarMakanan = new ArrayList<Menu>();
        ArrayList<Menu> daftarMinuman = new ArrayList<Menu>();


        private String nama;

        private String alamat;

        public Restaurant(String nama, String alamat) {
            this.nama = nama;
            this.alamat = alamat;
            daftarMakanan = new ArrayList<Menu>();
            daftarMinuman = new ArrayList<Menu>();
        }
        public String getNama() {
            return nama;
        }
        public String getAlamat() {
            return alamat;
        }

        public void tambahMakanan (Menu menu) {
            daftarMakanan.add(menu);
        }
        public void tambahMinuman (Menu menu) {daftarMinuman.add(menu);
        }



}

