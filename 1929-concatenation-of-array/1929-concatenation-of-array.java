class Solution {
    public int[] getConcatenation(int[] nums) {
        // Arrays.copyOf(source, source.length);
        int [] firstArray=Arrays.copyOf(nums,nums.length);
        int [] secondArray=Arrays.copyOf(nums,nums.length);
        return IntStream.concat(IntStream.of(firstArray), IntStream.of(secondArray)).toArray();
    }
}