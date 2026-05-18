package CM2;

class Pesanan {
    int kodePesanan, harga;
    String namaPesanan, namaPembeli;

    public Pesanan(){
    }

    public Pesanan(int kodePesanan, String namaPesanan,
                   int harga, String namaPembeli) {

        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
    }
}