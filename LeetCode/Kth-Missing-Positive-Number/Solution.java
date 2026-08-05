1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int low = 1, mid = 0;
4        int high = arr[arr.length - 1] + k;
5
6        while(low < high){
7            mid = low + (high - low) / 2;
8            if(missing(arr, mid, k)) high = mid;
9            else low = mid + 1;
10        }
11        return low;
12    }
13    public boolean missing(int arr[], int mid, int k){
14
15        int j = 0;
16        for(int num : arr){
17            if(num <= mid) j++;
18        }
19        int c = mid - j;
20        return c >= k;
21    }
22}