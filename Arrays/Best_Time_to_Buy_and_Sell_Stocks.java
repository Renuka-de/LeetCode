class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        if(len==1) return 0;
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<len;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            if(profit<prices[i]-buy)
            {
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
}
