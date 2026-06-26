package UAS;
// Class Transaksi digunakan agar data transaksi pembelian bisa disimpan.
// Catatan:
// Setiap transaksi memiliki relasi dengan class Barang.

public class Transaksi {
    String kodeTransaksi;
    Barang barang;
    int jumlah;
    double totalHarga;

    public Transaksi(String kodeTransaksi, Barang barang, int jumlah, double totalHarga) {
        this.kodeTransaksi = kodeTransaksi;
        this.barang = barang;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
    }

    public void tmplTransaksi() {
        System.out.println("Kode Transaksi : " + kodeTransaksi);
        System.out.println("Kode Barang : " + barang.kode);
        System.out.println("Nama Barang  : " + barang.nama);
        System.out.println("Harga Satuan: Rp " + barang.harga);
        System.out.println("Jumlah Beli : " + jumlah);
        System.out.println("Total Bayar : Rp " + totalHarga);
        System.out.println();
    }
}