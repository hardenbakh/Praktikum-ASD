package Jobsheet9;

public class StackSurat16 {
    Surat16[] stack;
    int size;
    int top;

    public StackSurat16(int size) {
        this.size = size;
        stack = new Surat16[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat16 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack Penuh! Tidak dapat menerima surat lagi.");
        }
    }

    public Surat16 pop() {
        if (!isEmpty()) {
            Surat16 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack Kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat di dalam tumpukan.");
            return null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Tumpukan surat kosong.");
        } else {
            System.out.println("Daftar Surat Izin (Teratas ke Terbawah):");
            for (int i = top; i >= 0; i--) {
                System.out.println("ID: " + stack[i].idSurat + " | Nama: " + stack[i].namaMahasiswa + 
                                   " | Kelas: " + stack[i].kelas + " | Jenis: " + stack[i].jenisIzin + 
                                   " | Durasi: " + stack[i].durasi + " hari");
            }
        }
    }
}
