package UAS;
// Class DLLBarang digunakan sebagai container untuk menyimpan
// catatan : seluruh data barang menggunakan Double Linked List.

public class DLLBarang {
    NodeBarang head;
    NodeBarang tail;

    public DLLBarang() {
        head = null;
        tail = null;
    }

    // Menambahkan barang ke akhir linked list
    public void tambahBarang(Barang barang) {

        NodeBarang baru = new NodeBarang(barang);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    // Menampilkan seluruh barang
    public void tampilBarang() {
        if (head == null) {
            System.out.println("Data barang masih kosong.");
            return;
        }
            NodeBarang bantu = head;

        while (bantu != null) {
            bantu.data.tmplBarang();
            bantu = bantu.next;
        }
    }

    // Mencari barang berdasarkan kode
    public Barang cariBarang(String kode) {

        NodeBarang bantu = head;

        while (bantu != null) {
            if (bantu.data.kode.equalsIgnoreCase(kode)) {
                return bantu.data;
            }
            bantu = bantu.next;
        }
        return null;
    }

    // Mengurangi stok barang setelah dibeli
    public void kurangiStok(String kode, int jumlah) {

        NodeBarang bantu = head;

        while (bantu != null) {
            if (bantu.data.kode.equalsIgnoreCase(kode)) {
                bantu.data.stok = bantu.data.stok - jumlah;
                return;
            }
            bantu = bantu.next;
        }
    }
}