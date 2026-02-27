package Jobsheet3;
import java.util.Scanner;

import Jobsheet3.Matakuliah16;

public class MataKuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        Matakuliah16[] arrayOfMatakuliah16 = new Matakuliah16[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0 ; i < arrayOfMatakuliah16.length ; i++){
            System.out.println("masukan data mata kuliah ke-" + (i +1));
            System.out.print("kode       :");
            kode = sc.nextLine();
             System.out.print("Nama      :");
            nama = sc.nextLine();
             System.out.print("SKS       :");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("jumlah jam :");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------");

            arrayOfMatakuliah16[i] = new Matakuliah16();
            arrayOfMatakuliah16[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMatakuliah16.length; i++) {
        System.out.println("Data Matakuliah ke-" + (i + 1));
        arrayOfMatakuliah16[i].cetakInfo();
    }

    }
}
