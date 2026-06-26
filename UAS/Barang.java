package UAS;
// Catatan:
// Karena dua angka terakhir NIM saya adalah 31 (ganjil),
// maka program yang dibuat adalah sistem transaksi pembelian.

public class Barang {
    
    String kode, nama;
    double harga;
    int stok;

    public Barang(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tmplBarang() {
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + nama);
        System.out.println("Harga Barang : Rp " + harga);
        System.out.println("Stok Barang  : " + stok);
    }
}