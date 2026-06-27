
class Solution {
    public int majorityElement(int[] nums) {
    
    Map<Integer,Integer> map= new HashMap<>();
    if (nums.length==1){
        return nums[0];
    }
    
     for(int i=0;i<nums.length;i++){
     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }
    int max=0;
    int maxKey=-1;

     for (Map.Entry<Integer,Integer> entry : map.entrySet()){
        int key= entry.getKey();
      int n=entry.getValue();
      if(n>max){
        max=n;
        maxKey=key;
      }
     }
   
     if(max>1){
      return maxKey;
     }
     return -1;

    }
}