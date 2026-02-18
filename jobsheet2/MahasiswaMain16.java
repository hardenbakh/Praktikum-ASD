package jobsheet2;

public class MahasiswaMain16 {
    
    public static void main(String[] args) {
        Mahasiswa16 mhsl = new Mahasiswa16();
        mhsl.nama = "Muhammad Bakhtiar Muqribillah";
        mhsl.nim = "254107060031";
        mhsl.kelas = "SIB 1-C";
        mhsl.ipk = 3.79;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SIB 1E");
        mhsl.updateIpk(4.85);
        mhsl.tampilkanInformasi();

        System.out.println();

        Mahasiswa16 mhs2 = new Mahasiswa16("Nabila Azkiya Ramadhani", "2141720160", 3.80, "TI 1C");
        mhs2.updateIpk(3.85);
        mhs2.tampilkanInformasi();
    }
}
