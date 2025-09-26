class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] maxDigits=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int maxi=0;
            while(x>0){
                int digit=x%10;
                maxi=Math.max(maxi,digit);
                x/=10;
            }
            maxDigits[i]=maxi;
            hm.put(maxi,hm.getOrDefault(maxi,0)+1);
        }
        int result=-1;
        for(int i:hm.keySet()){
            if(hm.get(i)>=2){
                int max1=-1;
                int max2=-1;
                for(int k=0;k<nums.length;k++){
                    if(maxDigits[k]==i){
                    int num=nums[k];
                    if(num>max1){
                        max2=max1;
                        max1=num;
                    }
                    else if(num>max2){
                        max2=num;
                    }}
                }
                if(max2!=-1){
                    result=Math.max(result,max1+max2);
                }
            }
        }
        return result;
    }
}