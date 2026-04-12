package minggu5;
import java.util.Scanner;

public class MainPangkat16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Pangkat16[] png = new Pangkat16[elemen];

        for(int i = 0; i < elemen; i++){

            System.out.print("Masukkan nilai yang dipangkatkan: ");
            int nilai = sc.nextInt();

            System.out.print("Masukkan nilai pangkat: ");
            int pangkat = sc.nextInt();

            png[i] = new Pangkat16(nilai, pangkat);
        }

        System.out.println("\nHasil Pangkat Brute Force");
        for(int i = 0; i < elemen; i++){
            System.out.println(
                png[i].nilai + "^" + png[i].pangkat +
                " = " + png[i].pangkatBF()
            );
        }

        System.out.println("\nHasil Pangkat Divide and Conquer");
        for(int i = 0; i < elemen; i++){
            System.out.println(
                png[i].nilai + "^" + png[i].pangkat +
                " = " + png[i].pangkatDC(png[i].nilai, png[i].pangkat)
            );
        }
    }
}