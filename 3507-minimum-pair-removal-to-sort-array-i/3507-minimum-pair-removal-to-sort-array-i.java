class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(nums[i]);
        }
        int res=0;
        while(!isNonDecreasing(ar)){
            int minSum=Integer.MAX_VALUE;
            int index=-1;
            for(int i=1;i<ar.size();i++){
                int sum=ar.get(i-1)+ar.get(i);
                if(sum<minSum){
                    minSum=sum;
                    index=i-1;
                }
            }
            ar.remove(index);
            ar.remove(index);
            ar.add(index,minSum);
            res++;
        }
        return res;
    }
    public boolean isNonDecreasing(ArrayList<Integer> ar){
        for(int i=1;i<ar.size();i++){
            if(ar.get(i)<ar.get(i-1)) return false;
        }
        return true;
    }
}