class Solution {
    public int removeDuplicates(int[] n) {
       int i=0;
        
    for( int j=1; j<n.length;j++){
        if(n[i]!=n[j]){
            n[i+1]=n[j];
            i++;    }

    }
    return i+1;
}}


    