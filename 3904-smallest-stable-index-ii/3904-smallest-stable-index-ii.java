class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int largest[]= new int[nums.length];
        largest[0] = nums[0];

        int smallest[]= new int[nums.length];
        smallest[nums.length-1] = nums[nums.length-1];

       for(int i = 1; i< nums.length; i++){
            if(nums[i]>largest[i-1]) largest[i] = nums[i];

            else largest[i] = largest[i-1];
       }
       for(int i = nums.length-2; i>=0; i--){
            if(nums[i]<smallest[i+1]) smallest[i] = nums[i];
            else smallest[i] = smallest[i+1];
       }
       int ans = -1;
       for(int i = 0; i< nums.length; i++){
            int diff = largest[i] - smallest[i];
            if(diff<=k) return i;
       }
       return ans;
    }
}