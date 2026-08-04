class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);
        // int low=0;
        // int high=nums.length-1;
        // List<Integer> n=new ArrayList<>();
        // for(int i=low;i<high;i++){
        //     for(int j=nums[i]+1;j<nums[i+1];j++){
        //         n.add(j);
        //     }
        // }
        // return n;

        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<small) small=nums[i];
            if(nums[i]>large) large=nums[i];
        }
        int[] freq=new int[large+1];
        for(int x:nums){
            freq[x]++;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=small;i<=large;i++){
            if(freq[i]<1) res.add(i);
        }
        return res;
    }
}