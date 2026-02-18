package jobsheet2;

public class mataKuliahMain16 {
    public static void main(String[] args) {
      
        mataKuliah16 mk1 = new mataKuliah16();
        mk1.kodeMk = "MK001";
        mk1.nama = "Pemrograman Java";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mataKuliah16 mk2 = new mataKuliah16("MK002", "Basis Data", 4, 8);

        System.out.println("=== Informasi Mata Kuliah 1 (Awal) ===");
        mk1.tampilInformasi();
        System.out.println();

        mk1.ubahSKS(4);
        mk1.kurangiJam(2);

        System.out.println("=== Informasi Mata Kuliah 1 (Setelah Perubahan) ===");
        mk1.tampilInformasi();
        System.out.println("=======================================\n");

        System.out.println("=== Informasi Mata Kuliah 2 (Awal) ===");
        mk2.tampilInformasi();
        System.out.println();

        mk2.tambahJam(2);
        mk2.kurangiJam(20);

        System.out.println("=== Informasi Mata Kuliah 2 (Setelah Perubahan) ===");
        mk2.tampilInformasi();
        System.out.println("=======================================\n");
    }
}
