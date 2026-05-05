package TugasQueue;
import java.util.Scanner;

public class MainKRS {

    static void menu() {
        System.out.println("\n1. Tambah Antrian");
        System.out.println("2. Proses KRS (2 mahasiswa)");
        System.out.println("3. Tampilkan Semua");
        System.out.println("4. Tampilkan 2 Terdepan");
        System.out.println("5. Tampilkan Terakhir");
        System.out.println("6. Jumlah Antrian");
        System.out.println("7. Sudah Proses");
        System.out.println("8. Sisa Belum Proses");
        System.out.println("9. Clear");
        System.out.println("10. Exit");
        System.out.print("Pilih: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    antrian.enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.tampilDepan2();
                    break;

                case 5:
                    antrian.tampilAkhir();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.jumlahSudahProses();
                    break;

                case 8:
                    antrian.sisaBelumProses();
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 10:
                    System.out.println("Selesai");
                    break;
            }

        } while (pilih != 10);

        sc.close();
    }
}