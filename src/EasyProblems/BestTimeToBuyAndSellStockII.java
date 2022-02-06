package EasyProblems;

public class BestTimeToBuyAndSellStockII {
    /**
     *  STATUS: ACCEPTED
     *  HELP ? NO
     *  NUM OF SUBMISSIONS ? 1
     *
     */


    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if(prices[i] < prices[i+1]){
                maxProfit += prices[i+1] - prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,6,4,3,1};

        System.out.println(maxProfit(prices));
    }
}
