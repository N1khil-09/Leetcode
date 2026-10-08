class Solution {
    public String removeOuterParentheses(String s) {
        List<String> ans = new ArrayList<>();
        int c=0;
        String valid = "";
        for(int i = 0; i<s.length(); i++){
            
            if(s.charAt(i)=='('){
                valid+=s.charAt(i);
                c++;
            }
            else if (s.charAt(i) == ')'){
                valid+=s.charAt(i);
                c--;
            } 
            if(c==0){
                ans.add(valid);
                valid="";
            }
        }
        String res="";
        for(String x : ans){
            res+=x.substring(1,x.length()-1);
        }
        return res;
        
    }
}