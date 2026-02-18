package jobsheet2;

public class Dosen16 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen16() {
    }

    public Dosen16(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama           : " + nama);
        System.out.println("Status Aktif   : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("---------------------------");
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        String statusStr = status ? "aktif" : "tidak aktif";
        System.out.println("Status dosen telah diubah menjadi: " + statusStr);
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidang);
    }
}
