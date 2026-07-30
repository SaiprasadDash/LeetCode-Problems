1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int low = 0, mid = 0;
4        int high = nums.length-1;
5        // if(nums.length == 1) return nums[0];
6        while(low < high){
7            mid = low + (high - low) / 2;
8            if ((high - mid) % 2 == 1) {
9                mid--;
10            }
11            if(nums[mid] == nums[mid + 1]){
12                low = mid+2;
13            }
14            else{
15                high = mid;
16            }
17        }
18        return nums[low];
19    }
20}