class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int n=envelopes.length;
        // O(n^2)
        // Arrays.sort(envelopes,(a,b)->{
        //     if(a[0]==b[0]) return b[1]-a[1];
        //     return a[0]-b[0];
        //     });
        // int[] dp=new int[n];
        // Arrays.fill(dp,1);
        // for(int i=1;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         if(envelopes[j][0]<envelopes[i][0] && envelopes[j][1]<envelopes[i][1]){
        //             dp[i]=Math.max(dp[i],dp[j]+1);
        //         }
        //     }
        // }
        // int max=0;
        // for(int i=0;i<n;i++){
        //     max=Math.max(max,dp[i]);
        // }
        // return max;


        //optimised
        Arrays.sort(envelopes,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
            });
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(envelopes[0][1]);
        for(int i=1;i<n;i++){
            if(envelopes[i][1]>arr.get(arr.size()-1)){
                arr.add(envelopes[i][1]);
            }
            else{
                int ind=lowerBound(arr,envelopes[i][1]);
                arr.set(ind,envelopes[i][1]);
            }
        }
        return arr.size();
    }
    public int lowerBound(ArrayList<Integer>arr,int target){
        int l=0;
        int r=arr.size()-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr.get(mid)>=target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}