package minggu5;
import java.util.Scanner;

public class MainFaktorial16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        Faktorial16 fk = new Faktorial16();

        System.out.println("Hasil BF : " + fk.faktorialBF(n));
        System.out.println("Hasil DC : " + fk.faktorialDC(n));
    }
}