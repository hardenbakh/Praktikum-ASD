package jobsheet2;

public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    double ipk;

public Mahasiswa16(){

}  

public Mahasiswa16(String nm, String nim, double ipk, String kls) {
    nama = nm ;
    this. nim = nim;
    this.ipk = ipk;
    kelas = kls;
}

    void tampilkanInformasi () {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas : " + kelas);
    }
    void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
    }
    void updateIpk (double ipkBaru){
       if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
         ipk = ipkBaru;
       } else {
        System.out.println("data tidak valid. IPK harus 0.0 sampai 4.0");
       }

       
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "kinerja baik";
        } else if (ipk >= 2.0) {
            return "kinerja cukup";
        } else {
            return "kinerja kurang";
        }
    }
}
