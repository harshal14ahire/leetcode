class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        
       List<String> result = new ArrayList<>(); // To store the final result

        // Iterate over each word in the input list
        for (String word : words) 
        {
            // Split the word by the separator
            String[] parts = word.split("\\"+String.valueOf(separator));

            // Add non-empty parts to the result
            for (String part : parts) 
            {
                if (!part.isEmpty()) 
                { // Exclude empty strings
                    result.add(part);
                }
            }
      }
      return result;

 }
}