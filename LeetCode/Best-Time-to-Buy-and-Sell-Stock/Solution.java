1class Solution {
2    public int maxProfit(int[] prices) {
3        int max = 0;
4        int ptr = 0;
5        for(int i = 1; i < prices.length; i++){
6            max = Math.max(prices[i] - prices[ptr], max);
7            if(prices[i] < prices[ptr]){
8                ptr = i;
9            }
10        }
11        return max;
12    }
13}