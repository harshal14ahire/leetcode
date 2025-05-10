class Solution {
    public int fib(int n) {
        return getFiboNumber(n);
    }

    int getFiboNumber(int n ){
        if( n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return getFiboNumber(n-1)+getFiboNumber(n-2);
    }
}
