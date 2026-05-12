package Pertemuan12;
import java.util.Scanner;

public class SLLMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList16 sll = new SingleLinkedList16();

        Mahasiswa16 mhs1 = new Mahasiswa16("21212203", "Dirga", "4D", 3.6);
        Mahasiswa16 mhs2 = new Mahasiswa16("22212202", "Cintia", "3C", 3.5);
        Mahasiswa16 mhs3 = new Mahasiswa16("23212201", "Bimon", "2B", 3.8);
        Mahasiswa16 mhs4 = new Mahasiswa16("24212200", "Alvaro", "1A", 4.0);

        sll.print();
        sll.addFirst(mhs1); 
        sll.print();
        sll.addLast(mhs4);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();


        System.out.println("data mahasiswa Baru");
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 

        
        Mahasiswa16 mhsBaru = new Mahasiswa16(nim, nama, kelas, ipk);
        
        // Menambahkan data baru ke akhir list
        sll.addLast(mhsBaru);

        System.out.println("\nIsi Linked List Setelah Penambahan Baru:");
        sll.print();


        // modifikasi percobaan 2
        System.out.println(" data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indeksOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}