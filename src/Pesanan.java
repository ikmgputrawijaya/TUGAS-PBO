import java.util.ArrayList;

public class Pesanan {

    //Deklarasi variable instance menu
    private Menu menu;

    public Pesanan(int jumlahOrder, int jarakRumah) {
        this.jumlah = jumlahOrder;
        this.jarakRumah = jarakRumah;
    }


    public ArrayList<Pesanan> getDaftarPesanan() {return getDaftarPesanan();}

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



   private int jumlah;
   private int jarakRumah;
}
