package minggu5;

public class Pangkat16 {

    int nilai;
    int pangkat;

    // konstruktor
    Pangkat16(int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    // Brute Force
    int pangkatBF(){
        int hasil = 1;
        for(int i = 0; i < pangkat; i++){
            hasil *= nilai;
        }
        return hasil;
    }

    // Divide and Conquer
    int pangkatDC(int n, int p){

        if(p == 0){
            return 1;
        }

        if(p % 2 == 1){
            return pangkatDC(n, p/2) * pangkatDC(n, p/2) * n;
        }else{
            return pangkatDC(n, p/2) * pangkatDC(n, p/2);
        }
    }
}