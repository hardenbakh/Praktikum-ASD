package Jobsheet9;

import java.util.Scanner;

public class SuratMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas maksimal tumpukan surat: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        StackSurat16 st = new StackSurat16(kapasitas);
        int pilih;

        do {
            System.out.println("\nMenu Utama Prodi:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Lihat Semua Daftar Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S: Sakit / I: Izin): ");
                    char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int dur = sc.nextInt();
                    
                    Surat16 s = new Surat16(id, nama, kls, jns, dur);
                    st.push(s);
                    break;

                case 2:
                    Surat16 diproses = st.pop();
                    if (diproses != null) {
                        System.out.println("Surat atas nama " + diproses.namaMahasiswa + " telah divalidasi oleh Prodi.");
                    }
                    break;

                case 3:
                    Surat16 teratas = st.peek();
                    if (teratas != null) {
                        System.out.println("Surat teratas saat ini: " + teratas.namaMahasiswa + " (" + teratas.idSurat + ")");
                    }
                    break;

                case 4:
                    st.print();
                    break;
                
                case 5:
                    System.out.println("Selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}