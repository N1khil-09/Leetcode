import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        for( int n : nums2){
            set.add(n);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n:nums1){
            if(set.contains(n)){
                arr.add(n);
                set.remove(n);
            }
        }
        int []res= new int[arr.size()];
        for(int i=0; i<arr.size();i++){
            res[i]=arr.get(i);

        }
        return res;



    }
}