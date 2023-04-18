import java.util.ArrayList;

public class Pesanan {
    //Deklarasi variable instance menu
    private Menu menu;
    private int jumlah;
    private int jarakRumah;

    public Pesanan(Menu menu, int jumlahOrder) {
        this.menu = menu;
        this.jumlah = jumlahOrder;
    }
    public ArrayList<Pesanan> getDaftarPesanan() {
        return getDaftarPesanan();
    }
    public Menu getMenu() {
        return menu;
    }
    public int getJumlahOrder() {
        return jumlah;
    }
    public int getJarakRumah() {
        return jarakRumah;
    }
    public int getTotalHarga() {
        return menu.getHargaMenu() * jumlah + (jarakRumah/2);
    }
}
