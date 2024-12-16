class Solution {
    public boolean isBalanced(String num) {
        int oddsum=0;
        int evensum=0;
        for(int i=0; i<num.length();i++)
        {
            if(i%2!=0)
            {
                oddsum+=Character.getNumericValue(num.charAt(i));
            }
            else{
                evensum+=Character.getNumericValue(num.charAt(i));
            }
        }
        return oddsum==evensum?true:false;
        
    }
}