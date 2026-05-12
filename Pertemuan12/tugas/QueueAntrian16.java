package Pertemuan12.tugas;

public class QueueAntrian16 {
    Node16 front, rear;
    int size;

    // Cek antrian kosong 
    public boolean isEmpty() {
        return front == null;
    }

    // Mengosongkan antrian 
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    // Menambahkan antrian [cite: 321]
    public void enqueue(Mahasiswa16 data) {
        Node16 newNode = new Node16(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data.nama + " berhasil mendaftar ke antrian.");
    }

    // Memanggil antrian (mengambil yang terdepan) [cite: 322]
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Memanggil antrian: " + front.data);
            front = front.next;
            if (front == null) rear = null;
            size--;
        }
    }

    // Menampilkan antrian terdepan dan paling akhir [cite: 323]
    public void peek() {
        if (!isEmpty()) {
            System.out.println("--- Posisi Antrian ---");
            System.out.println("Paling Depan  : " + front.data);
            System.out.println("Paling Belakang: " + rear.data);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    // Menampilkan jumlah mahasiswa yang masih mengantre [cite: 324]
    public void displaySize() {
        System.out.println("Jumlah mahasiswa dalam antrean: " + size);
    }
}