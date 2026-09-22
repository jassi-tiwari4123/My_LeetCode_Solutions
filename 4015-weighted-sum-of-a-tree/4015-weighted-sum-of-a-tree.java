class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;
        long sum=0;
        //children list
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++){
            arr.get(parent[i]).add(i);
        }
        //making the depth array
        int[] depth=new int[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        depth[0]=1;
        int height=1;
        while(!q.isEmpty()){
            int x=q.poll();
            height=Math.max(height,depth[x]);
            for(int y:arr.get(x)){
                depth[y]=depth[x]+1;
                q.add(y);
            }
        }
        for(int i=0;i<n;i++){
            sum=sum+((long)nums[i]*(height-depth[i]+1));
        }
        return sum;
    }
}