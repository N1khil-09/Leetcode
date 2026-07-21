class Solution {
    boolean binary(int low, int high, int []arr, int target){
        while(low<= high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid] > target) high = mid-1;
            else low = mid + 1;
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int index = -1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            return binary(0,nums.length-1,nums,target);
        }
        if(target>=nums[0] && target <= nums[index]){
            return binary(0,index,nums,target);
        }

        if(target>=nums[index+1] && target <= nums[nums.length-1]){
            return binary(index+1,nums.length-1,nums,target);
        }
        return false;
    }
}