1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low = 1; int mid = 0;
4        int high = 0;
5        for(int i = 0; i < piles.length; i++){
6            high = Math.max(high, piles[i]);
7        }
8
9        while(low <= high){
10            mid = low + (high - low) / 2;
11            if(eatbanana(piles, mid, h)) high = mid - 1;
12            else{
13                low = mid + 1;
14            }
15        }
16        return low;
17    }
18    public boolean eatbanana(int piles[], int mid, int h){
19        long c = 0;
20        for(int pile : piles){
21            int div = pile / mid;
22            c += div;
23            if(pile % mid != 0) c++;
24        }
25        return c <= h;
26    }
27}