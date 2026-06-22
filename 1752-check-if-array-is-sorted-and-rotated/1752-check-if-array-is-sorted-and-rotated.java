import java.util.Arrays;
class Solution {
    void reverse(int arr[], int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public boolean check(int[] nums) {
        int ind=-1;
        int temp[]= new int [nums.length];
        for(int i=0; i<nums.length; i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        for( int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            boolean p=true;
            for(int i=0; i<nums.length; i++){
                if(nums[i]!=temp[i]){
                    return false;
                }
            }
            return p;

        }
        reverse(nums,0,ind);
        reverse(nums,ind+1,nums.length-1);
        reverse(nums,0,nums.length-1);
        for( int i=0; i<nums.length;i++){
            if(nums[i]!=temp[i]){
                return false;
            }
        }
        return true;

        


    }
}