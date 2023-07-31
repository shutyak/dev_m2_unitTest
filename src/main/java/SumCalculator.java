public class SumCalculator {
    int sum(int n){
        if (n==0){
            throw new IllegalArgumentException("Bad argument 0");
        }
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        return sum;
    }
}
