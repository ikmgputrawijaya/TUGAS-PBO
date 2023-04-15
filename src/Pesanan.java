public class Pesanan {
   private Menu menu;
   private int jumlah;

    public Pesanan(Menu menu, int banyakMenu) {

    }

    public Menu getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getTotalHarga() {
        return menu.getHargaMenu() * jumlah;
    }


}
