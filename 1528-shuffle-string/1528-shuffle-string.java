class Solution {
    public String restoreString(String s, int[] indices) {

    String str="";
    for(int i:indices)
    {
        str=str+s.charAt(i);
    } 
    return str;       
    }
}