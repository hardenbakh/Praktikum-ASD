package Pertemuan12.tugas;
import java.util.Scanner;

public class MainAntrian16 {
    public static void main(String[] args) {
        QueueAntrian16 q = new QueueAntrian16();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n--- LAYANAN UNIT KEMAHASISWAAN ---");
            System.out.println("1. Daftar Antrian (Enqueue)");
            System.out.println("2. Panggil Mahasiswa (Dequeue)");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Cek Jumlah Pengantre");
            System.out.println("5. Kosongkan Semua Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    q.enqueue(new Mahasiswa16(nim, nama));
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.displaySize();
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (menu != 6);
        sc.close();
    }
}