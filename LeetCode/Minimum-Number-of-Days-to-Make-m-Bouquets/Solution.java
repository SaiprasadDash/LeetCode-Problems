1class Solution {
2    public int minDays(int[] bloomDay, int m, int k) {
3        int low = Integer.MAX_VALUE, mid = 0;
4        int high = Integer.MIN_VALUE;
5        if((long)m*k > bloomDay.length) return -1;
6        for(int bloom : bloomDay){
7            low = Math.min(low, bloom);
8            high = Math.max(high, bloom);
9        }
10        while(low < high){
11            mid = low + (high - low) / 2;
12            if(isBloomed(bloomDay, mid, k, m)) high = mid;
13            else low = mid + 1;
14        }
15        return low;
16    }
17    public boolean isBloomed(int bloomDay[], int mid, int k, int m){
18        int b = 0;
19        int c = 0;
20        for(int bloom : bloomDay){
21            if(mid >= bloom) c++;
22            else {
23                b += c/k;
24                c = 0;
25            }
26        }
27        b += c/k;
28        return b >= m;
29    }
30}