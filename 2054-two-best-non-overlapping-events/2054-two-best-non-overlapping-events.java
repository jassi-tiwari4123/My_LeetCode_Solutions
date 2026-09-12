//recursive
// class Solution {
//     public int maxTwoEvents(int[][] events) {
//         int n=events.length;
//         Arrays.sort(events,(a,b)->{
//             if(a[0]!=b[0]){
//                 return a[0]-b[0];
//             }
//             return a[1]-b[1];});
//         return fxn(events,0,0);
//     }
//     public int fxn(int[][] events,int i,int cnt){
//         if(cnt==2 || i==events.length){
//             return 0;
//         }
//         int nextValidInd=binarySearch(events,events[i][1]);
//         int take=events[i][2]+fxn(events,nextValidInd,cnt+1);
//         int nTake=fxn(events,i+1,cnt);
//         return Math.max(take,nTake);
//     }
//     public int binarySearch(int[][] events,int last){
//         int l=0;
//         int h=events.length-1;
//         int res=events.length;
//         while(l<=h){
//             int mid=l+(h-l)/2;
//             if(events[mid][0]>last){
//                 res=mid;
//                 h=mid-1;
//             }
//             else{
//                 l=mid+1;
//             }
//         }
//         return res;
//     }
// }


//memo
class Solution {
    int[][] dp;
    public int maxTwoEvents(int[][] events) {
        int n=events.length;
        Arrays.sort(events,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];});
        dp=new int[n+1][3];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(events,0,0);
    }
    public int fxn(int[][] events,int i,int cnt){
        if(cnt==2 || i==events.length){
            return 0;
        }
        if(dp[i][cnt]!=-1) return dp[i][cnt];
        int nextValidInd=binarySearch(events,events[i][1]);
        int take=events[i][2]+fxn(events,nextValidInd,cnt+1);
        int nTake=fxn(events,i+1,cnt);
        return dp[i][cnt]=Math.max(take,nTake);
    }
    public int binarySearch(int[][] events,int last){
        int l=0;
        int h=events.length-1;
        int res=events.length;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(events[mid][0]>last){
                res=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
}