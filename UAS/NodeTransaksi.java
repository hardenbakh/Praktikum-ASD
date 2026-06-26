package UAS;
// catatan:
// Setiap node menyimpan satu data transaksi serta
// alamat node sebelumnya dan sesudahnya.

public class NodeTransaksi {
    Transaksi data;
    NodeTransaksi prev;
    NodeTransaksi next;

    public NodeTransaksi(Transaksi data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}