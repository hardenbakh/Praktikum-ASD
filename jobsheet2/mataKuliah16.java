package jobsheet2;

public class mataKuliah16 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public mataKuliah16(){
    }
    public mataKuliah16(String kodemk, String name, int sks, int jumlahJam){
        kodeMk = kodemk;
        nama = name;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){  
        System.out.println("nama mata kuliah : " + nama);
        System.out.println("kode mata kuliah :" + kodeMk ); 
        System.out.println("jumlah sks :" + sks);
        System.out.println("jumlah jam :" + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("sks telah diubah menjadi :" + sksBaru);
    }
    void tambahJam(int jam){
        this.jumlahJam += jam;
        System.out.println("jumlah jam setelah ditambah : " + jumlahJam);
    }
    void kurangiJam(int jam){
        if (jumlahJam - jam >= 0) {
            jumlahJam -= jam;
            System.out.println("pengurangan jam gagal. jumlah jam tidak cukup.");
            System.out.println("jumlah jam saat ini tetap: " + jumlahJam);
        }
    }
}
