package UAS;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DLLBarang daftarBarang = new DLLBarang();
        DLLTransaksi daftarTransaksi = new DLLTransaksi();

        daftarBarang.tambahBarang(new Barang("B001", "headset", 500000, 15));
        daftarBarang.tambahBarang(new Barang("B002", "Mouse", 150000, 20));
        daftarBarang.tambahBarang(new Barang("B003", "Keyboard", 250000, 15));
        daftarBarang.tambahBarang(new Barang("B004", "braket", 200000, 8));
        daftarBarang.tambahBarang(new Barang("B005", "Printer", 1800000, 5));

        int pilihan;

        do {

            System.out.println();
            System.out.println("PROGRAM TRANSAKSI KASIR");
            System.out.println("1. Lihat Data Barang");
            System.out.println("2. Transaksi Pembelian");
            System.out.println("3. Lihat Semua Transaksi");
            System.out.println("4. Urutkan Transaksi");
            System.out.println("5. Total Pendapatan");
            System.out.println("6. Keluar");
            
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.println("DATA BARANG");
                    daftarBarang.tampilBarang();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("TRANSAKSI PEMBELIAN");
                    daftarTransaksi.beliBarang(daftarBarang);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("DATA TRANSAKSI");
                    daftarTransaksi.tampilTransaksi();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("SORTING TRANSAKSI");
                    daftarTransaksi.sortingNamaBarang();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("TOTAL PENDAPATAN");
                    daftarTransaksi.totalPendapatan();
                    break;

                case 6:
                    System.out.println();
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 6);
    }
}