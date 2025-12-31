class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        int m=queries.length;
        Arrays.sort(nums);
        for(int k=1;k<n;k++){
            nums[k]+=nums[k-1];
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<m;i++){
            int sum=queries[i];
            int len=0;
            int low=0,high=n-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(sum>=nums[mid]){
                    len=mid+1;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            arr.add(len);

        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}