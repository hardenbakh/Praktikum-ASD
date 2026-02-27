package Jobsheet3.tugasJobsheet3;
import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen16[] arrayOfDosen = new Dosen16[jumlah];

        // FOR untuk input
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
            Boolean jk = sc.nextBoolean();

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen16(kode, nama, jk, usia);
            System.out.println();
        }

             DataDosen16 data = new DataDosen16();

        System.out.println("=== Semua Data Dosen ===");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("=== Jumlah Dosen Per Jenis Kelamin ===");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("=== Rata-rata Usia Dosen Per Jenis Kelamin ===");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("=== Dosen Paling Tua ===");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("=== Dosen Paling Muda ===");
        data.infoDosenPalingMuda(arrayOfDosen);
    }
}