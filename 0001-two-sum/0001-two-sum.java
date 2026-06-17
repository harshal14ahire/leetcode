class Solution {
    public int[] twoSum(int[] nums, int target) {

    int[] preFix= new int [2];
    Map<Integer,Integer> map= new HashMap<>();
    map.put(nums[0],0);
    for(int i =1;i< nums.length; i++){
        int mapEle =target-nums[i];
        if(map.containsKey(mapEle)){
            preFix[0]=i;
            preFix[1]=map.get(mapEle);
        }
        map.put(nums[i],i);
    }
    return preFix;
    }
}