package CM2;

public class DLLPesanan {

    NodePesanan head;
    NodePesanan tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan data) {

        NodePesanan baru = new NodePesanan(data);

        if (isEmpty()) {

            head = tail = baru;

        } else {

            tail.next = baru;
            baru.prev = tail;

            tail = baru;
        }
    }

    // bubble sort manual
    public void sortingPesanan() {

        if (head == null) {
            return;
        }

        boolean tukar;

        do {

            tukar = false;

            NodePesanan current = head;

            while (current.next != null) {

                if (current.data.namaPesanan.compareToIgnoreCase(
                        current.next.data.namaPesanan) > 0) {

                    // tukar data
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    public void tampilPesanan() {

        if (isEmpty()) {

            System.out.println("Belum ada pesanan");
            return;
        }

        sortingPesanan();

        NodePesanan temp = head;

        int total = 0;

        System.out.println("\n=== LAPORAN PESANAN ===");

        while (temp != null) {

            System.out.println(
                    "Kode : " + temp.data.kodePesanan +
                    "   Menu : " + temp.data.namaPesanan +
                    "   Harga : " + temp.data.harga +
                    "   Pembeli : " + temp.data.namaPembeli
            );

            total += temp.data.harga;

            temp = temp.next;
        }

        System.out.println("Total Pendapatan : " + total);
    }
}