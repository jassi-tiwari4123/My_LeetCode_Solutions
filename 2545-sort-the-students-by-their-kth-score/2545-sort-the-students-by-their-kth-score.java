class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        //using sort
        // Arrays.sort(score,(a,b)->b[k]-a[k]);
        // return score;


        //normal
        int n=score.length;
        int m=score[0].length;
        for(int i=0;i<n;i++){
            int cur=i;
            for(int j=cur+1;j<n;j++){
                if(score[j][k]>score[cur][k]){
                    cur=j;
                }
            }
            //swap
            int[] temp=score[i];
            score[i]=score[cur];
            score[cur]=temp;
        }
        return score;
    }
}