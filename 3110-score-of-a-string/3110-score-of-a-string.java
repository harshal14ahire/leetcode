class Solution {
    public int scoreOfString(String s) {
       int score=0;
       int j=0;
       for( int i=0;i<s.length()-1 && j<s.length();i++)
       {
             j=i+1;
             score+=Math.abs(((int)s.charAt(i))-((int)s.charAt(j)));


       }
       return score;
        
    }
}