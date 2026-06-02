class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int landF=landStartTime[i]+landDuration[i];
                int waterSt=Math.max(landF,waterStartTime[j]);
                int fin1=waterSt + waterDuration[j];

                int waterF= waterStartTime[j]+waterDuration[j];
                int landSt=Math.max(waterF,landStartTime[i]);
                int fin2=landSt+landDuration[i];
                res=Math.min(res,Math.min(fin1,fin2));
            }
        }
        return res;
    }
}