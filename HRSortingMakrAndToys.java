import java.util.*;

public class HRSortingMakrAndToys {

    static int maximumToys(int[] prices, int k){
        Arrays.sort(prices);
        int summ = 0;
        for(int i = 0; i < prices.length;i++){
            summ += prices[i];
            if(summ > k) return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++) prices[i] = in.nextInt();
        System.out.println(maximumToys(prices, k));
    }
}
