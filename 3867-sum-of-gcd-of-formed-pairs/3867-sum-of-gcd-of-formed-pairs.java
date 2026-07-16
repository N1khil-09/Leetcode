import java.util.*;
class Solution {
    public static long gcd(long a, long b) {
    while (b != 0) {
        long temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public long gcdSum(int[] nums) {
        long max=nums[0];
        long []prefix = new long[nums.length];
        for(int i=0; i<nums.length; i++){
            max = Math.max(nums[i],max);
            prefix[i] = gcd(nums[i],max); 
        }
        Arrays.sort(prefix);
        int i=0;
        int j = prefix.length-1;
        long ans=0;
        while(i<j){
            long gcd = gcd(prefix[i],prefix[j]);
            ans+=gcd;
            i++;
            j--;
        }
        return ans;
    }
}