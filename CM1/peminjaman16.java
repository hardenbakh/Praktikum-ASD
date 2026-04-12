public class peminjaman16 {
    MahasiswaCM16 mhs;
    Buku16 buku;
    int lamaPinjam, batas = 5, terlambat, denda;

    peminjaman16(MahasiswaCM16 mhs, Buku16 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        terlambat = lamaPinjam - batas;

        if (terlambat > 0) {
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " +
                buku.judul + " | " + lamaPinjam +
                " hari | Denda: " + denda);
    }
}