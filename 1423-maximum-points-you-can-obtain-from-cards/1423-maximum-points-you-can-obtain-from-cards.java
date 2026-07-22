class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int score=0;
        for(int i=0; i<k; i++){
            score+=cardPoints[i];
        }
        int l=k-1;
        int r=cardPoints.length-1;
        int max=score;
        while(l>=0){
            score-=cardPoints[l--];
            score+=cardPoints[r--];
            max= Math.max(max, score);
        }
        return max;
    }
}