package jobsheet2;

public class Mahasiswa16 {
      String nim;
    String nama;
    String kelas;
    double ipk;

    void tampilkaninformasi () {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }
    void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
    }
    void updateIpk (double ipkBaru){
        ipk = ipkBaru;
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "kinerja baik";
        } else if (ipk >= 20) {
            return "kinerja cukup";
        } else {
            return "kinerja kurang";
        }
    }
}
