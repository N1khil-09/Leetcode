import java.util.*;
class Solution {
    int max1= Integer.MIN_VALUE;
    int max2= Integer.MIN_VALUE;
    int p1=1;
    int p2 = 1;
    public int maxProduct(int[] nums) {
        for ( int i =0; i < nums.length; i++){
            
            p1=p1*nums[i];
            max1= Math.max(max1,p1);
            if(p1==0){
                p1=1;
                continue;
            }
        }
        for( int i = nums.length-1; i>=0; i--){
            
            p2*=nums[i];
            max2=Math.max(max2,p2);
            if(p2==0){
                p2=1;
                continue;
            }
        }
        return Math.max(max1,max2);
    }
}