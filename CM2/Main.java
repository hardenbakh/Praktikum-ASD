package CM2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DLLPembeli antrean = new DLLPembeli();
        DLLPesanan pesanan = new DLLPesanan();

        int nomorAntrian = 1;

        int pilih;

        do {
            System.out.println("\n=== ROYAL DELISH ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan ");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String hp = sc.nextLine();

                    Pembeli p = new Pembeli(
                            nomorAntrian,
                            nama,
                            hp
                    );

                    antrean.tambahAntrian(p);

                    System.out.println("Antrian berhasil ditambahkan");

                    nomorAntrian++;

                    break;

                case 2:

                    antrean.cetakAntrian();

                    break;

                case 3:

                    Pembeli keluar = antrean.hapusAntrian();

                    if (keluar == null) {

                        System.out.println("Antrian kosong");

                    } else {

                        System.out.println(
                                keluar.namaPembeli +
                                " dipanggil ke kasir"
                        );

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String menu = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();

                        Pesanan ps = new Pesanan(
                                kode,
                                menu,
                                harga,
                                keluar.namaPembeli
                        );

                        pesanan.tambahPesanan(ps);

                        System.out.println("Pesanan berhasil ditambahkan");
                    }

                    break;

                case 4:
                    pesanan.tampilPesanan();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 5);
    }
}
