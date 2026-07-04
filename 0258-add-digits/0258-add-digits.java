class Solution {
    public int addDigits(int num) {
        boolean flag=true;
        while(flag){
            int res=0;
            while(num>0){
                int rem= num%10;
                res+=rem;
                num/=10;
            }
            if(res<10){
                return res;
            }
            num=res;
        }
        return 0;
    }
}