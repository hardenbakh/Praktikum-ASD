import java.util.Scanner;
public class MahasiswaDemo16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();

        System.out.print("Masukkan jumlah mahasiswa: "); 
        int jumMhs = sc.nextInt(); 
        list.listMhs = new Mahasiswa16[jumMhs];

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            System.out.println("-------------------------------------");
          
            sc.nextLine();

            Mahasiswa16 m = new Mahasiswa16(nim, nama, kelas, ipk);
            list.tambah(m);
        }
    
       list.tampil();
       
        System.out.println("-------------------------------------------------");
        System.out.println("pencarian data");
        System.out.println("-------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari");
        System.out.println("IPK");
        double cari = sc.nextDouble();

        sc.nextLine();

        //sequential searching
        //  System.out.println("-------------------------------------------------");
        // System.out.println("menggunakan sequential searching");
        //  System.out.println("-------------------------------------------------");
        // double posisi = list.sequentialSearch(cari);
        // list.tampilPosisi(cari, posisi);
        // list.tampilDataSearch(cari, posisi);
   
        // binary searching
        System.out.println("-------------------------------------------------");
        System.out.println("menggunakan sequential searching");
         System.out.println("-------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs);
        int pss2 = (int)posisi2;
        list.tampilPosisi(pss2, cari);
        list.tampilDataSearch(pss2, cari);
        
    }
}
