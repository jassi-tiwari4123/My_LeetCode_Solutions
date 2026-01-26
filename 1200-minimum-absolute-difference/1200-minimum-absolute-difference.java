class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        List<List<Integer>> res=new ArrayList<>();
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            minDiff=Math.min(minDiff,Math.abs(arr[i]-arr[i+1]));
        }
        for(int i=0;i<n-1;i++){
            int x=Math.abs(arr[i]-arr[i+1]);
            if(x==minDiff){
                List<Integer> op=new ArrayList<>();
                op.add(arr[i]);
                op.add(arr[i+1]);
                res.add(op);
            }
        }
        return res;
    }
}