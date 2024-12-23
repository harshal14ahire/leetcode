class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())
        return false;
        int sum2=0,sum1=0;
       for(int i=0;i<s1.length();i++)
       {
         if(s1.charAt(i)!=s2.charAt(i))
         {
            sum1++;
         }
       }
       return sum1==0||sum1==2?true:false;
    }
}