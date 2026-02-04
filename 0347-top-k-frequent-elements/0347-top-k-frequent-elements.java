class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
         Map<Integer, Integer> map =
                new TreeMap<>();
         for( int i =0;i<nums.length;i++){
           map.merge(nums[i], 1, Integer::sum);
         }
         Map<Integer, Integer> sortedMap = map.entrySet() .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue, 
                (oldValue, newValue) -> oldValue, 
                LinkedHashMap::new 
            ));
         return sortedMap.keySet().stream().limit(k).mapToInt(Integer::intValue) .toArray();
    }
}