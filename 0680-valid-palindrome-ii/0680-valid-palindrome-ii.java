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
    StringBuilder sb = new StringBuilder(s);
    String reversed = sb.reverse().toString();
    return s.equals(reversed);
}
}