import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
       Arrays.sort(nums);
       int max=1;
       int c=0;
       int prev= Integer.MIN_VALUE;
       for( int i= 0; i < nums.length; i++){
        if(prev==nums[i]-1){
            c++;
            prev=nums[i];
            

        }
    
        else if(prev!=nums[i]){
            c=1;
            prev=nums[i];
            
        }
        max=Math.max(max,c);
        
       }
       return max;
       
    }
}