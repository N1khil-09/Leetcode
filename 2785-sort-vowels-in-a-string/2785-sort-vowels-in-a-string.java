
class Solution {
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        
        for( int i = 0; i < s.length(); i++){
            
            if(isVowel(s.charAt(i))) vowels.add(s.charAt(i));
            }
        Collections.sort(vowels);
        int p = 0;
        String ans="";
        for(int i =0; i<s.length(); i++){
            if(!isVowel(s.charAt(i)))  ans=ans+s.charAt(i);
            else ans=ans+vowels.get(p++);
        }
        return ans;
    
        
       
    }
    
}