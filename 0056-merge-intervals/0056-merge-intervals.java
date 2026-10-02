class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        ArrayList<int[]> ans=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<n;i++){
            int nextS=intervals[i][0];
            int nextE=intervals[i][1];
            if(end>=nextS){
                end=Math.max(end,nextE);
            }
            else{
                ans.add(new int[]{start,end});
                start=nextS;
                end=nextE;
            }
        }
        ans.add(new int[]{start,end});
        int len=ans.size();
        int[][] res=new int[len][2];
        for(int i=0;i<len;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}