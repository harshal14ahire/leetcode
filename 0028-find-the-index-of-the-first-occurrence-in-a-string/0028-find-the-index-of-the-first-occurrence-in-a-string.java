class Solution {
    public int strStr(String haystack, String needle) {
        StringBuffer s=new StringBuffer(haystack);
        return s.indexOf(needle);
    }
}