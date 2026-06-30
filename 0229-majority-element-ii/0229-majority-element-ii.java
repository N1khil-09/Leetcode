import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0; int c2=0;
        int e1=Integer.MAX_VALUE;
        int e2=Integer.MAX_VALUE;
        for ( int i=0; i< nums.length; i++){
            if(c1==0 && nums[i]!=e2){
                c1=1;
                e1=nums[i];
            }
            else if(c2==0 && nums[i]!=e1){
                c2=1;
                e2=nums[i];
            }
            else if(e1==nums[i]){
                c1++;
            }
            else if(e2==nums[i]){
                c2++;
            }
            else {
                c1--;c2--;
            }
        }
        int co1=0;
        int co2=0;
        List<Integer> list = new ArrayList<>();
        for( int x : nums){
            if(x==e1){
                co1++;
            }
            if(x==e2){
                co2++;
            }
            
        }
        if(co1>nums.length/3){
                list.add(e1);
            }
            if(co2>nums.length/3){
                list.add(e2);
            }
        return list;

    }
}