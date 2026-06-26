package UAS;
// catatan: Setiap node menyimpan satu objek Barang serta alamat node sebelumnya
// dan node sesudahnya.

public class NodeBarang {
    Barang data;
    NodeBarang prev;
    NodeBarang next;

    public NodeBarang(Barang data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}