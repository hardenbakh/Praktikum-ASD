package Jobsheet3;
import java.util.Scanner;

import jobsheet2.mataKuliah16;
public class MahasiswaDemo16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa16 [] arrayOfMahasiswa16 = new Mahasiswa16[3];
        String dummy;

    for (int i=0; i < 3; i++){
        arrayOfMahasiswa16 [i] = new Mahasiswa16();

        System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
        System.out.print("NIM   : ");
        arrayOfMahasiswa16[i].nim = sc.nextLine();
        System.out.print("Nama   : ");
        arrayOfMahasiswa16[i].nama = sc.nextLine();
       System.out.print("Kelas   : ");
        arrayOfMahasiswa16[i].kelas = sc.nextLine();
        System.out.print("IPK   : ");
        dummy = sc.nextLine();
        arrayOfMahasiswa16[i].ipk = Float.parseFloat(dummy);
        System.out.println("------------------------------------");
    }
    
    for (int i=0;i<arrayOfMahasiswa16.length;i++){
        arrayOfMahasiswa16[i].CetakInfo();
    }
       
    }
}
