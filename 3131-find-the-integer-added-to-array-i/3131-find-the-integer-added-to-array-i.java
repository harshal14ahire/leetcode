class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0,sum2=0;
     for(int i=0;i<nums1.length;i++)
     {
            sum1+=nums1[i];
            sum2+=nums2[i];
     }
     return (sum2/nums2.length)-(sum1/nums1.length);
     

    }
}