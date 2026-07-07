class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        long num=0;
        long res=0;
        int sum=0;
        while(n>0){
            sum+=n%10;
            if(n%10>0){
                num=num*10+(n%10);
            }
            n/=10;
        }
        while(num>0){
            if(num%10>0){
                res=res*10+(num%10);
            }
            num/=10;
        }
        return sum*res;
    }
}