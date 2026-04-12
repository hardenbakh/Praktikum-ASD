public class MahasiswaCM16{
    String nim;
    String nama;
    String prodi;

MahasiswaCM16 (){    
}

MahasiswaCM16(String nim, String nama, String prodi){
    this.nim= nim;
    this.nama = nama;
    this.prodi = prodi;

}

void tampilMahasiswa (){
    System.out.println(nim + " | " + nama + " | " + prodi);
}

}