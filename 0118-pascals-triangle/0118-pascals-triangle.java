class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(1);
            for(int j=1;j<i;j++){
                int ans=res.get(i-1).get(j-1)+res.get(i-1).get(j);
                arr.add(ans);
            }
            if(i>0) arr.add(1);
            res.add(arr);
        }
        return res;
    }
}