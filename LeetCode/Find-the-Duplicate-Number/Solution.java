1class Solution {
2    public int findDuplicate(int[] nums) {
3        // List<Integer> hmap = new ArrayList<>();
4        Arrays.sort(nums);
5        int ptr = 0;
6        for(int i = 0; i < nums.length-1; i++){
7            // if(hmap.contains(nums[i])){
8            //     return nums[i];
9            // }
10            // else{
11            //     hmap.add(nums[i]);
12            // }
13            if(nums[i] == nums[i+1]){
14                return nums[i];
15            }
16            ptr++;
17        }
18        return 0;
19    }
20}