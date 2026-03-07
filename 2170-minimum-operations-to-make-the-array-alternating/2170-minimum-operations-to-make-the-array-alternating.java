class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> even=new HashMap<>();
        HashMap<Integer,Integer> odd=new HashMap<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.put(nums[i],even.getOrDefault(nums[i],0)+1);
            }
            else{
                odd.put(nums[i],odd.getOrDefault(nums[i],0)+1);
            }
        }

        int[] evenMaxElFreq=fxn(even);
        int[] oddMaxElFreq=fxn(odd);

        int e1=evenMaxElFreq[0];
        int fe1=evenMaxElFreq[1];
        int e2=evenMaxElFreq[2];
        int fe2=evenMaxElFreq[3];

        int o1=oddMaxElFreq[0];
        int fo1=oddMaxElFreq[1];
        int o2=oddMaxElFreq[2];
        int fo2=oddMaxElFreq[3];

        if(e1!=o1){
            return n-fe1-fo1;
        }
        return Math.min(n-fe2-fo1,n-fe1-fo2);

    }
    public int[] fxn(HashMap<Integer,Integer> hm){
        int v1=0;
        int v2=0;
        int c1=0;
        int c2=0;
        for(int key:hm.keySet()){
            int freq=hm.get(key);
            if(freq>c1){
                c2=c1;
                v2=v1;
                c1=freq;
                v1=key;
            }
            else if(freq>c2){
                c2=freq;
                v2=key;
            }
        }
        return new int[]{v1,c1,v2,c2};
    }
}