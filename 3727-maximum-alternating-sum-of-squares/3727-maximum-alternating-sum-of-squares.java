class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<0) nums[i] = -1*nums[i]; 
        }
        Arrays.sort(nums);
        for(int i = nums.length/2; i<nums.length; i++){
            ans+=nums[i]*nums[i];
        }
        for(int i = 0; i<nums.length/2; i++){
            ans-=nums[i]*nums[i];
        }
        return ans;
    }
}