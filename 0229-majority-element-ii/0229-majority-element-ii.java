class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list= new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for( int i=0;i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int n=nums.length;
        for( int x : nums){
            if(hm.get(x)>n/3){
                if(!list.contains(x))
                    list.add(x);
            }
        }
        return list;

    }
}