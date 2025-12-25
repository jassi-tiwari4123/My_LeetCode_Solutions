class Solution {
    public int countQuadruplets(int[] nums) {
        //O(n^4)
        // int n=nums.length;
        // int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             for(int l=k+1;l<n;l++){
        //                 if(nums[i]+nums[j]+nums[k]==nums[l]){
        //                     count++;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return count;


        //O(n^3)
        //pehle hum map mein store kar lenge saare values greater than c index
        int n=nums.length;
        int count=0;
        for(int c=n-2;c>=2;c--){
            HashMap<Integer,Integer> hm=new HashMap<>();

            for(int i=c+1;i<n;i++){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }//yaha saare elements with index greater than c hm mein daal diya
            for(int a=0;a<c;a++){
                for(int b=a+1;b<c;b++){
                    int sum=nums[a]+nums[b]+nums[c];
                    count+=hm.getOrDefault(sum,0);
                }
            }
        }
        return count;
    }
}