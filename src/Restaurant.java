import java.util.ArrayList;

public class Restaurant {
    //Menyimpan data Menu
    private static ArrayList<Menu> daftarMenu = new ArrayList<Menu>();
    private static ArrayList<Pesanan> daftarPesanan = new ArrayList<Pesanan>();
    private int idRestoran;
    private String nama;
    private String alamat;
    //Constructor class Restaurant
    public Restaurant(int idRestoran, String nama, String alamat) {
        this.idRestoran = idRestoran;
        this.nama = nama;
        this.alamat = alamat;
        this.daftarMenu = new ArrayList<>();
        this.daftarPesanan = new ArrayList<>();
    }
    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    //Mengubah nilai atribut dengan nilai parameter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    //Mengembalikan nilai dari atribut nama dan alamat
    public int getIdRestoran() {
        return idRestoran;
    }
    public String getNama() {
            return nama;
        }
    public String getAlamat() {
            return alamat;
        }
    public ArrayList<Pesanan> getDaftarPesanan(){
        return daftarPesanan;
    }
    public void tambahMenu (Menu menu) {
        daftarMenu.add(menu);
    }
    public void tambahPesanan (Pesanan pesanan){
        daftarPesanan.add(pesanan);
    }


    //Deklarasi variable instance menu
//    private Menu menu;
//    private int jumlahOrder;
//    private int jarakRumah;



//    public ArrayList<Pesanan> getDaftarPesanan() {return getDaftarPesanan();}

//    public Menu getMenu() {
//        return menu;
//    }
//    public int getJumlah() {
//        return jumlahOrder;
//    }
//    public int getJarakRumah() {
//        return jarakRumah;
//    }
//    public int getTotalHarga() {
//        return menu.getHargaMenu() * jumlahOrder + (jarakRumah/2);
//    }
}

