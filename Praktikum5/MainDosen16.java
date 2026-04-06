import java.util.Scanner;

public class MainDosen16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen16 data = new DataDosen16();

        int pilih;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble)");
            System.out.println("4. Sorting DSC (Selection)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen16 d = new Dosen16(kd, nm, jk, usia);
                    data.tambah(d);
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    data.tampil();
                    break;
            }
        } while (pilih != 5);
    }
}