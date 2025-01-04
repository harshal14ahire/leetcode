class Solution {
    public int alternateDigitSum(int n) 
    {
        String str= Integer.toString(n);
        int count =1;int sum=0;
        for(int i=0;i<str.length();i++)
        {
                if(count%2!=0)
                {
                    sum+=Character.getNumericValue(str.charAt(i));
                   }
                   else{
                    sum-=Character.getNumericValue(str.charAt(i));
                   }
                   count++;
        }
        return sum;

        
    }
}