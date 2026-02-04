import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
         Map<Integer, Integer> map =
                new TreeMap<>();
         for( int i =0;i<nums.length;i++){
           map.merge(nums[i], 1, Integer::sum);
         }
     return map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)                                                    
                .mapToInt(Map.Entry::getKey)                                 
                .toArray();
    }
}