public class Dosen16 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen16(String kd, String nm, boolean jk, int usia) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil() {
        System.out.println(kode + " | " + nama + " | " +
                (jenisKelamin ? "L" : "P") + " | " + usia);
    }
}