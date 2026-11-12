class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long both= cost1+cost2;
        long total=0;
        if(both>=costBoth){
            if(need1>need2){
                total+= (long) need2*costBoth;
                need1-=need2;
                need2=0;
            }
            else{
                total+= (long) need1*costBoth;
                need2-=need1;
                need1=0;
            }
        }
        if(need1!=0){
            if(cost1>costBoth) total+= (long) need1*costBoth;
            else total+= (long) need1*cost1;
        }
        if(need2!=0){
            if(cost2>costBoth) total+= (long) need2*costBoth;
            else total+= (long) need2*cost2;
        }
        return total;
    }
}