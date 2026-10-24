class Solution {
    public int countDaysTogether(String aAlice, String lAlice, String aBob, String lBob) {
        int cnt=0;
        int AA=getDay(aAlice);
        int LA=getDay(lAlice);
        int AB=getDay(aBob);
        int LB=getDay(lBob);
        int start=Math.max(AA,AB);
        int end=Math.min(LA,LB);
        if(start>end) return 0;
        return end-start+1;
    }
    public int getDay(String x){
        int day=Integer.parseInt(x.substring(3));
        int month=Integer.parseInt(x.substring(0,2));
        int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays=day;
        for(int i=0;i<month-1;i++){
            totalDays+=days[i];
        }
        return totalDays;
    }
}