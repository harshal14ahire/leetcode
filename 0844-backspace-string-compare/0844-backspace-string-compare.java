class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        return (countSpaces(s)!=countSpaces(t))?false:true;

    }
    public int countSpaces(String s)
    {       
            int cnt=0;
            for( int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='#')
                cnt++;
                
            }
            return cnt;

    }

}