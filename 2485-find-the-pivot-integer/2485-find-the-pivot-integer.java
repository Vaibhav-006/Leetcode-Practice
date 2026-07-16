class Solution {
    public int pivotInteger(int n) {
        int suffix=0;
        for(int i=1; i<=n; i++){
            suffix+=i;
        }
        int prefix=0;
        for(int i=1; i<=n; i++){
            suffix-=i;
            if(prefix==suffix){
                return i;
            }
            prefix+=i;
        }
        return -1;
        
    }
}