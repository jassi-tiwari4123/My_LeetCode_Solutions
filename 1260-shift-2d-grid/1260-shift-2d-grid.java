class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int totalLen=n*m;
        int shift=k%totalLen;
        List<List<Integer>> res=new ArrayList<>();
        int z=0;
        int[] samp=new int[totalLen];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                samp[z++]=grid[i][j];
            }
        }
        int x=0;
        int[] inter=new int[totalLen];
        // for(int i=totalLen-shift;i<totalLen;i++){
        //     inter[x]=samp[i];
        //     x++;
        // }
        // for(int i=0;i<totalLen-shift;i++){
        //     inter[x]=samp[i];
        //     x++;
        // }

        for(int i=0;i<totalLen;i++){
            inter[(i+shift)%totalLen]=samp[i];
        }
        int ind=0;
        for(int i=0;i<n;i++){
            List<Integer> part=new ArrayList<>();
            for(int j=0;j<m;j++){
                part.add(inter[ind++]);
            }
            res.add(part);
        }   
        return res;
    }
}