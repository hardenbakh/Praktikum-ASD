package minggu5;
import java.util.Scanner;

public class MainSum16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jumlah elemen: ");
        int bulan = sc.nextInt();

        int keuntungan[] = new int[bulan];

        for(int i = 0; i < bulan; i++){
            System.out.print("Masukkan keuntungan ke-" + (i+1) + " : ");
            keuntungan[i] = sc.nextInt();
        }

        Sum16 sm = new Sum16(keuntungan);

        System.out.println("Total keuntungan (Brute Force) = " + sm.totalBF());
        System.out.println("Total keuntungan (Divide Conquer) = " + sm.totalDC(0, bulan-1));
    }
}