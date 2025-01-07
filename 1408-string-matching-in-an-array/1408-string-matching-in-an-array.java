class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> l= new ArrayList<>();
        for(String s1:words)
        {
            for(String s2:words)
            {   if(!s2.equals(s1))
                {
                    if(isPresent(s2,s1)&& !l.contains(s1))
                     l.add(s1);
                 }
            }

        }
        return l;
        
    }
    public boolean isPresent(String s2,String s1)
    {
            if(s2.contains(s1))
            return true;
        
            else return false;
    }
}