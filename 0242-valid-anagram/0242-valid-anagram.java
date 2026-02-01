class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        else{
            // 
            // 1. Convert the string to a character array
        // char[] chars = original.toCharArray();
        
        // // 2. Sort the character array
        // Arrays.sort(chars);
        
        // // 3. Convert the sorted array back to a String
        // String sorted = new String(chars);
        
        char []sstr = s.toCharArray();
        Arrays.sort(sstr);
        
        char [] tstr=t.toCharArray();
        Arrays.sort(tstr);
        
        if(Arrays.equals(sstr,tstr)){
        return true;
        }
        else{return false;}
        }
    }
}