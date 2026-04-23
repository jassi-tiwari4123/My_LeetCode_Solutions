class Solution {
    public long[] getDistances(int[] nums) {
        int n=nums.length;
        long[] res=new long[n];
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.putIfAbsent(nums[i],new ArrayList<>());
            hm.get(nums[i]).add(i);
        }
        for(ArrayList<Integer> l:hm.values()){
            long sumL=0;
            long countL=0;
            int size=l.size();
            long total=0;
            for(int i:l) total+=i;
            long sumR=total;
            long countR=size;
            for(int j=0;j<size;j++){
                int idx=l.get(j);
                sumR-=idx;
                countR--;
                long left=countL*idx-sumL;
                long right=sumR-countR*idx;
                res[idx]=left+right;
                sumL+=idx;
                countL++;
            } 
        }
        return res;
    }
}