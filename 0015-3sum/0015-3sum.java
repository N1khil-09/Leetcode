import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();
        for( int i=0; i<nums.length;i++){
            
            HashSet<Integer> set = new HashSet<>();
            
            for(int j=i+1; j<nums.length;j++){
                List<Integer> rows = new ArrayList<>();
                int third = -1 * (nums[i]+nums[j]);
                if(set.contains(third)){
                    rows.add(nums[i]);
                    rows.add(nums[j]);
                    rows.add(third);
                    
                    rows.sort(null);
                }
                if(!rows.isEmpty()){
                ans.add(rows);}
                set.add(nums[j]);
            }
            
        }
        for(List<Integer> l : ans){
            list.add(l);
        }
        return list;
    }
}