class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        int arr[] = new int[A.length];
        for(int i = 0; i<A.length; i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i],hm.get(A[i])+1);
            }
            else hm.put(A[i],1);

            if(hm.get(A[i])==2) count++;

            if(hm.containsKey(B[i])){
                hm.put(B[i],hm.get(B[i])+1);
            }
            else hm.put(B[i],1);

            if(hm.get(B[i])==2) count++;

            arr[i]=count;
        }
        return arr;
    }
}