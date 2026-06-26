package UAS;
import java.util.Scanner;
// Class DLLTransaksi digunakan sebagai container untuk
// menyimpan seluruh data transaksi menggunakan Double Linked List.

public class DLLTransaksi {
    NodeTransaksi head;
    NodeTransaksi tail;

    Scanner input = new Scanner(System.in);
    int nomorTransaksi = 1;
    double totalPendapatan = 0;

    public DLLTransaksi() {
        head = null;
        tail = null;
    }

    // Menambahkan transaksi ke linked list
    public void tambahTransaksi(Transaksi transaksi) {

        NodeTransaksi baru = new NodeTransaksi(transaksi);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
        totalPendapatan = totalPendapatan + transaksi.totalHarga;
    }

    // Proses pembelian barang
    public void beliBarang(DLLBarang daftarBarang) {
        String kode;
        int jumlah;
        char member;

        System.out.print("Masukkan kode barang : ");
        kode = input.nextLine();

            Barang barang = daftarBarang.cariBarang(kode);

        if (barang == null) {
            System.out.println("Barang tidak ditemukan.");
            return;
        }
        if (barang.stok == 0) {
            System.out.println("Stok barang habis.");
            return;
        }
        System.out.print("Jumlah beli : ");
            jumlah = input.nextInt();
            input.nextLine();

        if (jumlah > barang.stok) {
            System.out.println("Stok tidak mencukupi.");
            return;
        }
        double total = barang.harga * jumlah;

        if (total > 500000) {
            total = total - (total * 0.05);
            System.out.println("Diskon 5% diberikan.");
        }

        System.out.print("Apakah Member? (Y/T) : ");
        member = input.next().charAt(0);
        input.nextLine();

        if (member == 'Y' || member == 'y') {
            total = total - (total * 0.02);
            System.out.println("Diskon Member 2% diberikan.");
        }
        daftarBarang.kurangiStok(kode, jumlah);

        String kodeTransaksi = "TR" + nomorTransaksi;
        nomorTransaksi = nomorTransaksi + 1;

            Transaksi transaksi = new Transaksi(kodeTransaksi, barang, jumlah, total);
            tambahTransaksi(transaksi);

        System.out.println();
        System.out.println("===== TRANSAKSI BERHASIL =====");
        transaksi.tmplTransaksi();
    }

    // Menampilkan seluruh transaksi
    public void tampilTransaksi() {

        if (head == null) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        NodeTransaksi bantu = head;
        while (bantu != null) {

            bantu.data.tmplTransaksi();

            bantu = bantu.next;
        }
    }

    // Menampilkan total pendapatan
    public void totalPendapatan() {

        System.out.println("Total Pendapatan");
        System.out.println("Rp " + totalPendapatan);
    }

    // Sorting transaksi berdasarkan nama barang (Ascending)
    public void sortingNamaBarang() {

        if (head == null) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        boolean tukar;

        do {

            tukar = false;

            NodeTransaksi bantu = head;

            while (bantu.next != null) {

                if (bantu.data.barang.nama.compareToIgnoreCase(bantu.next.data.barang.nama) > 0) {

                    Transaksi sementara = bantu.data;
                    bantu.data = bantu.next.data;
                    bantu.next.data = sementara;

                    tukar = true;
                }
                bantu = bantu.next;
            }
        } while (tukar);
        System.out.println("Data transaksi berhasil diurutkan.");
    }
}