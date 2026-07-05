import java.util.*;
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for( int i = 0; i< nums1.length; i++){
            set.add(nums1[i]);
        }
        for( int i = 0; i< nums2.length; i++){
            if(set.contains(nums2[i])){
                min = Math.min(min,nums2[i]);
            }
        }
        if(min==Integer.MAX_VALUE)
            return -1;
        return min;
    }
}