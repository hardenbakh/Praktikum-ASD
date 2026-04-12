import java.util.Scanner;

public class PeminjamanMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MahasiswaCM16[] mhs = {
            new MahasiswaCM16("22001", "Andi", "Teknik Informatika"),
            new MahasiswaCM16("22002", "Budi", "Teknik Informatika"),
            new MahasiswaCM16("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku16[] buku = {
            new Buku16("B001", "Algoritma", 2020),
            new Buku16("B002", "Basis Data", 2019),
            new Buku16("B003", "Pemrograman", 2021),
            new Buku16("B004", "Fisika", 2024)
        };

        peminjaman16[] peminjaman = {
            new peminjaman16(mhs[0], buku[0], 7),
            new peminjaman16(mhs[1], buku[1], 3),
            new peminjaman16(mhs[2], buku[2], 10),
            new peminjaman16(mhs[2], buku[3], 6),
            new peminjaman16(mhs[0], buku[1], 4)
        };

        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            if (pilih == 1) {
                for (int i = 0; i < mhs.length; i++) {
                    mhs[i].tampilMahasiswa();
                }
            }

            else if (pilih == 2) {
                for (int i = 0; i < buku.length; i++) {
                    buku[i].tampilBuku();
                }
            }

            else if (pilih == 3) {
                for (int i = 0; i < peminjaman.length; i++) {
                    peminjaman[i].tampil();
                }
            }

            else if (pilih == 4) {

                // hitung denda
                for (int i = 0; i < peminjaman.length; i++) {
                    peminjaman[i].hitungDenda();
                }

                // insertion sort
                for (int i = 1; i < peminjaman.length; i++) {
                    peminjaman16 key = peminjaman[i];
                    int j = i - 1;

                    while (j >= 0 && peminjaman[j].denda < key.denda) {
                        peminjaman[j + 1] = peminjaman[j];
                        j--;
                    }

                    peminjaman[j + 1] = key;
                }

                for (int i = 0; i < peminjaman.length; i++) {
                    peminjaman[i].tampil();
                }
            }

            else if (pilih == 5) {
                sc.nextLine();
                System.out.print("Masukkan NIM: ");
                String cari = sc.nextLine();

                // sort nim
                for (int i = 1; i < peminjaman.length; i++) {
                    peminjaman16 key = peminjaman[i];
                    int j = i - 1;

                    while (j >= 0 && peminjaman[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                        peminjaman[j + 1] = peminjaman[j];
                        j--;
                    }

                    peminjaman[j + 1] = key;
                }

                // binary search
                int kiri = 0, kanan = peminjaman.length - 1;
                boolean ketemu = false;

                while (kiri <= kanan) {
                    int tengah = (kiri + kanan) / 2;

                    if (peminjaman[tengah].mhs.nim.equals(cari)) {
                        peminjaman[tengah].tampil();
                        ketemu = true;
                        break;
                    } else if (peminjaman[tengah].mhs.nim.compareTo(cari) < 0) {
                        kiri = tengah + 1;
                    } else {
                        kanan = tengah - 1;
                    }
                }

                if (!ketemu) {
                    System.out.println("Data tidak ditemukan");
                }
            }

        } while (pilih != 0);
    }
}