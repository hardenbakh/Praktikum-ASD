public class MahasiswaBerprestasi16 {
    Mahasiswa16[] listMhs = new Mahasiswa16[5];
    int idx;

    void tambah(Mahasiswa16 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa16 m : listMhs) {
            m.tampilInformasi();
        }
    }

   double sequentialSearch(double cari) {
    double posisi = -1;
    for (int i = 0; i < listMhs.length; i++) {
        if (listMhs[i].ipk == cari) {
            posisi = i;
            break;
        }
    }
    return posisi;
    }

  void tampilPosisi(double x, double pos) {
    if (pos != -1) {
        System.out.println("Data ditemukan pada indeks " + (int) pos); // casting
    } else {
        System.out.println("Data tidak ditemukan");
    }
}

    void tampilDataSearch(double x, double pos) {
    if (pos != -1) {
        System.out.println("Data Mahasiswa:");
        listMhs[(int) pos].tampilInformasi(); // casting di sini
    } else {
        System.out.println("Data tidak ditemukan");
    }
}

    
 int findBinarySearch(double cari, int left, int right) {
    if (right >= left) {
        int mid = (left + right) / 2;

       //Perbaikan kode untuk descending:

        if (listMhs[mid].ipk == cari) {
        return mid;
        } else if (listMhs[mid].ipk < cari) {
        return findBinarySearch(cari, left, mid - 1);
        } else {
    return findBinarySearch(cari, mid + 1, right);
}
    }
    return -1;
}
}