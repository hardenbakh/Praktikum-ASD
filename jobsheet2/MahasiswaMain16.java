package jobsheet2;

public class MahasiswaMain16 {
    
    public static void main(String[] args) {
        Mahasiswa16 mhsl = new Mahasiswa16();
        mhsl.nama = "Muhammad Bakhtiar Muqribillah";
        mhsl.nim = "254107060031";
        mhsl.kelas = "SIB 1-C";
        mhsl.ipk = 3.79;

        mhsl.tampilkaninformasi();
        mhsl.ubahKelas("SIB 1E");
        mhsl.updateIpk(3.85);
        mhsl.tampilkaninformasi();
    }
}
