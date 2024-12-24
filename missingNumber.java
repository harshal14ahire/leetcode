class Solution {
    int missingNumber(int arr[]) {
        int sum1=0;
      for(int i=1;i<=arr.length+1;i++)
      {
          sum1+=i;
      }
        
        int sum2=0;
        for(int i:arr)
        {
            sum2+=i;
        }
        return Math.abs(sum1-sum2);
        // code here
    }
}
