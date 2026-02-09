class Solution {
    public int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] sumArray = new int[2];
    for (int i = 0; i < numbers.length; i++) {
        int complement = target - numbers[i];
        if (map.containsKey(complement)) {
            sumArray[0] = map.get(complement)+1; 
            sumArray[1] = i+1;                   
            return sumArray;
        }
        map.put(numbers[i], i);
    }
    return sumArray;
    }
}