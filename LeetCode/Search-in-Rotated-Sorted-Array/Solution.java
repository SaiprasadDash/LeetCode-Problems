1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0, mid = 0;
4        int high = nums.length - 1;
5
6        while(low <= high){
7            mid = low + (high - low) / 2;
8            if(nums[mid] == target) return mid;
9            else if(nums[low] <= nums[mid]){
10                if(nums[low] <= target && target < nums[mid])
11                    high = mid - 1;
12                else
13                    low = mid + 1; 
14            }
15            else{
16                if(target > nums[mid] && target <= nums[high])
17                    low = mid + 1;
18                else
19                    high = mid - 1; 
20            }
21        }
22        return -1;
23    }
24}