class Solution {
    public int minimumPushes(String word) {
        String str="";
        HashMap<Character, Integer> set = new HashMap<>();
        for(int i =0; i< word.length();i++){
            if(!set.containsKey(word.charAt(i)))
                set.put(word.charAt(i),1);
            else 
                set.put(word.charAt(i),set.get(word.charAt(i))+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
            for(int x : set.values()){
                list.add(x);
            }
            list.sort(Collections.reverseOrder());
        int n = set.size();
        int ans = 0;
        if(n<=8){
             return word.length();
            }
        
        int i=1;
        int mul = 1;
        for(int x : list){
            mul = (i - 1) / 8 + 1;
            ans+= mul*x;
            i++;
            
        }
            return ans;
    
}
}