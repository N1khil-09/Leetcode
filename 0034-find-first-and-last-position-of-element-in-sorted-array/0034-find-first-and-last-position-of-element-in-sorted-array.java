class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        int lb=nums.length;
            int xxx[]={-1,-1};

        while ( low <= high ){
            int mid = low + (high - low )/2;
            if( nums[mid]>=target){
                lb=mid;
                high = mid-1;
            }
            else low = mid + 1;
        }
        low =0;
        high = nums.length-1;
        int ub=nums.length;
        while( low <= high){
           int mid = low + (high - low )/2;
            if( nums[mid]> target){
                ub=mid;
                high = mid-1;
            }
            else low = mid + 1;
        }
        if(lb==ub ){
            return xxx;
        }
        
        int ans[]={lb,ub-1};
        return ans;
    }
}