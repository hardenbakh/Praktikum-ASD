package Jobsheet3.tugasJobsheet3;

public class Dosen16 {
    String kode;
    String nama;
    Boolean jenisKelamin; // true = Pria, false = Wanita
    int usia;

    public Dosen16(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("-------------------------------");
    }
}