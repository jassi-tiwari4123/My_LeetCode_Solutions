class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->{if(a[0]==b[0]){
            return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int res=0;
        int max=-1;
        for(int[] i:intervals){
            if(i[1]>max){
                res++;
                max=i[1];
            }
        }
        return res;
    }
}