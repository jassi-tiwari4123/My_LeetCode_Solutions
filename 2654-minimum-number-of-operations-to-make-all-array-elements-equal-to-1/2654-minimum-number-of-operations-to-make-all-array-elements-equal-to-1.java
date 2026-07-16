class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
        }
        if(count>0) return n-count;
        int op=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int curGcd=nums[i];
            for(int j=i+1;j<n;j++){
                curGcd=gcd(curGcd,nums[j]);
                if(curGcd==1) {
                    op=Math.min(op,j-i);
                    break;
                }
            }
        }
        return op==Integer.MAX_VALUE?-1:op+(n-1);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}