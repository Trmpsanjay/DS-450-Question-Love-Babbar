
link for o(n) : https://leetcode.com/problems/find-the-duplicate-number/discuss/72934/Share-my-solution-O(N)-time-O(1)-space.-12-ms


class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
        
    }
}
