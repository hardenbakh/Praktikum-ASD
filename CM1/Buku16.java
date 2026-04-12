public class Buku16 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku16(){

    }

    Buku16(String kode, String judul, int tahun){
        kodeBuku = kode;
        this.judul = judul;
        tahunTerbit = tahun;
    }

    void tampilBuku(){
        System.out.println(kodeBuku + " | " + judul + " | " + tahunTerbit);
    }
}
