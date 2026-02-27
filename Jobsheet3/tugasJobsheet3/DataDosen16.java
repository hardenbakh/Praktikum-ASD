package Jobsheet3.tugasJobsheet3;
public class DataDosen16 {

    public void dataSemuaDosen(Dosen16[] arrayOfDosen) {
        for (Dosen16 d : arrayOfDosen) {
            d.tampilInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen16 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen16[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int pria = 0, wanita = 0;

        for (Dosen16 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                pria++;
            } else {
                totalWanita += d.usia;
                wanita++;
            }
        }

        if (pria > 0)
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / pria));
        if (wanita > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / wanita));
    }

    public void infoDosenPalingTua(Dosen16[] arrayOfDosen) {
        Dosen16 tertua = arrayOfDosen[0];

        for (Dosen16 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampilInfo();
    }

    public void infoDosenPalingMuda(Dosen16[] arrayOfDosen) {
        Dosen16 termuda = arrayOfDosen[0];

        for (Dosen16 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampilInfo();
    }
}