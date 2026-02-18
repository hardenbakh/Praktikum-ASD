package jobsheet2;

public class DosenMain16 {
    public static void main(String[] args) {
        
        Dosen16 dosen1 = new Dosen16();
        dosen1.idDosen = "DSN001";
        dosen1.nama = "Dr. Andi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Sistem Informasi";

        Dosen16 dosen2 = new Dosen16("DSN002", "Prof. Budi Hartono", false, 2005, "Teknik Komputer");

        System.out.println("=== Informasi Dosen Awal ===");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();

        dosen1.setStatusAktif(false);

        int masaKerja = dosen2.hitungMasaKerja(2026);
        System.out.println("Masa kerja " + dosen2.nama + " adalah " + masaKerja + " tahun.");

        dosen2.ubahKeahlian("Kecerdasan Buatan");

        System.out.println("\n=== Informasi Dosen Setelah Perubahan ===");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();
    }
}
