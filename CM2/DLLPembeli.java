package CM2;

public class DLLPembeli {

    NodePembeli head;
    NodePembeli tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli data) {

        NodePembeli baru = new NodePembeli(data);

        // jika list kosong
        if (isEmpty()) {

            head = tail = baru;

        } else {

            // untuk penghubungan node
            tail.next = baru;
            baru.prev = tail;

            // pindah tail ke yang baru
            tail = baru;
        }
    }

    public void cetakAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        NodePembeli temp = head;

        System.out.println("\n=== DAFTAR ANTRIAN ===");

        while (temp != null) {

            System.out.println(
                    "No : " + temp.data.nomorAntrian +
                    "    Nama : " + temp.data.namaPembeli +
                    "    HP : " + temp.data.noHp
            );

            temp = temp.next;
        }
    }

    public Pembeli hapusAntrian() {

        if (isEmpty()) {
            return null;
        }

        Pembeli dataKeluar = head.data;

        // jika hanya 1 node
        if (head == tail) {

            head = tail = null;

        } else {

            head = head.next;
            head.prev = null;
        }

        return dataKeluar;
    }
}