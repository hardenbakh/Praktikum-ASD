package minggu5;

public class Sum16 {

    int keuntungan[];

    Sum16(int keuntungan[]){
        this.keuntungan = keuntungan;
    }

    // Brute Force
    int totalBF(){
        int total = 0;
        for(int i = 0; i < keuntungan.length; i++){
            total += keuntungan[i];
        }
        return total;
    }

    // Divide and Conquer
    int totalDC(int l, int r){

        if(l == r){
            return keuntungan[l];
        }

        int mid = (l + r) / 2;

        int lsum = totalDC(l, mid);
        int rsum = totalDC(mid + 1, r);

        return lsum + rsum;
    }
}