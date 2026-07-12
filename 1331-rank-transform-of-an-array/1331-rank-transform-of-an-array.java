import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for( int i =0 ; i<arr.length; i++){
            temp[i]= arr[i];
            
        }
        Arrays.sort(temp);
        int r = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < temp.length; i++) {
            if (!hm.containsKey(temp[i])) {
                hm.put(temp[i], r);
                r++;
            }
        }
        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = hm.get(arr[i]);
        }
        return ans;

    }
}