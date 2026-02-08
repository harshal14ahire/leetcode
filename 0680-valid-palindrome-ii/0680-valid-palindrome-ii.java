class Solution {
    public boolean validPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<s.length()&& j>=0;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
             return isPalindrome(remove(s, i)) || isPalindrome(remove(s, j));
            }
        
        }
        return true ;
        
    }
    public String remove(String s, int i){
        return s.substring(0, i) + s.substring(i + 1);
    }
    
    public boolean isPalindrome(String s) {
    // Create the builder with the string content
    StringBuilder sb = new StringBuilder(s);
    
    // Reverse the content in-place
    String reversed = sb.reverse().toString();
    
    // Check if the original equals the reversed
    return s.equals(reversed);
}
}