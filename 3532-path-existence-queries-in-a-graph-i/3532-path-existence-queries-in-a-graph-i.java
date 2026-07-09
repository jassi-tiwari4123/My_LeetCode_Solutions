class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] parComp=new int[n];
        int i=0;
        parComp[0]=0;
        for(int j=1;j<n;j++){
            if(nums[j]-nums[j-1]>maxDiff){
                i++;
            }
            parComp[j]=i;
        }
        boolean[] res=new boolean[queries.length];
        for(int j=0;j<queries.length;j++){
            int x=queries[j][0];
            int y=queries[j][1];
            res[j]=(parComp[x]==parComp[y]);
        }
        return res;
    }
}