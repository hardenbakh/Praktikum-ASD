package minggu5;

public class Nilai16 {

    int uts[];
    int uas[];

    Nilai16(int uts[], int uas[]){
        this.uts = uts;
        this.uas = uas;
    }

    // mencari nilai UTS tertinggi (Divide and Conquer)
    int maxUTS(int l, int r){
        if(l == r){
            return uts[l];
        }

        int mid = (l + r) / 2;

        int left = maxUTS(l, mid);
        int right = maxUTS(mid + 1, r);

        if(left > right){
            return left;
        }else{
            return right;
        }
    }

    // mencari nilai UTS terendah (Divide and Conquer)
    int minUTS(int l, int r){
        if(l == r){
            return uts[l];
        }

        int mid = (l + r) / 2;

        int left = minUTS(l, mid);
        int right = minUTS(mid + 1, r);

        if(left < right){
            return left;
        }else{
            return right;
        }
    }

    // menghitung rata-rata UAS (Brute Force)
    double rataUAS(){
        int total = 0;

        for(int i = 0; i < uas.length; i++){
            total += uas[i];
        }

        return (double) total / uas.length;
    }
}