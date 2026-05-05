package TugasQueue;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahProses = 0;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa m) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = m;
        size++;
    }

    // 🔥 panggil 2 mahasiswa sekaligus
    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");

        for (int i = 0; i < 2; i++) {
            Mahasiswa m = data[front];
            m.tampilkanData();

            size--;
            sudahProses++;

            if (size == 0) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        int i = front;
        while (i != rear) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
        data[i].tampilkanData();
    }

    public void tampilDepan2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
            return;
        }

        int i = front;
        for (int j = 0; j < 2; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public void tampilAkhir() {
        if (!isEmpty()) {
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void jumlahSudahProses() {
        System.out.println("Sudah proses: " + sudahProses);
    }

    public void sisaBelumProses() {
        int total = sudahProses + size;
        int belum = 30 - sudahProses;
        if (belum < 0) belum = 0;

        System.out.println("Belum proses: " + belum);
    }
}