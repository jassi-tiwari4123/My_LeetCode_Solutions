class Solution {
    public int uniqueXorTriplets(int[] nums) {

        //noob approach

        // int n=nums.length;
        // Set<Integer> res=new HashSet<>();
        // Set<Integer> pairs=new HashSet<>();
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         pairs.add(nums[i]^nums[j]);
        //     }
        // }
        // int n1=pairs.size();
        // for(int x:pairs){
        //     for(int j=0;j<n;j++){
        //         res.add(x^nums[j]);
        //     }
        // }
        // return res.size();


        //pro approach we know ki xor ka value max value of nums ke binary representation mein number of bit se exceed nhi hoga like max value of nums is 3 which is generally 011 has three bit so max xor can go upto 7(111) three bits max so instead of defining set pairs we will make array of size this

        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int ans=1;
        while(ans<=max){
            ans*=2;
        }
        boolean[] pairs=new boolean[ans];// boolean to avoid duplicates varna array ka size can exceed 
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int res=nums[i]^nums[j];
                pairs[res]=true;
            }
        }
        boolean[] res=new boolean[ans];
        for(int i=0;i<pairs.length;i++){
            for(int j=0;j<n;j++){
                if(pairs[i]){
                    int xor=i^nums[j];
                    res[xor]=true;
                }
            }
        }
        int op=0;
        for(int i=0;i<ans;i++){
            if(res[i]){
                op++;
            }
        }
        return op;


    }
}