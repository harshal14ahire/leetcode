class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<(n/2)+1;i++)
        {
            if(n%i==0)
            l.add(i);
        }
        l.add(n);
        int cnt=1;
        int num=-1;
        for(Integer i:l)
        {
        
            if(cnt==k)
            num=i;

              cnt++;
        }
        return num;
        
    }
}