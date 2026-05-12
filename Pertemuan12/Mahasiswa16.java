package Pertemuan12;

public class Mahasiswa16 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa16(){
    }

    public Mahasiswa16 (String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi(){
       System.out.print(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
        System.out.println();
    }

}
