class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int c=0;
        String valid = "";
        int index=0;
        for(int i = 0; i<s.length(); i++){
            
            if(s.charAt(i)=='('){
                
                c++;
            }
            else if (s.charAt(i) == ')'){
                c--;
            } 
            if(c==0){
                ans+=s.substring(index+1,i);
                index=i+1;
            }
        }
        return ans;
        
    }
}