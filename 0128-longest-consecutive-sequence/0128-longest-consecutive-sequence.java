import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if( nums.length==0){
            return 0;
        }
        int max=1;
        Set<Integer> set = new HashSet<>();
        for( int i=0; i< nums.length; i++){
            set.add(nums[i]);
        }
        for(int x : set){
            if(!set.contains(x-1)){
                int c=1;
                while(set.contains(x+1)){
                    c++;
                    x++;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
}