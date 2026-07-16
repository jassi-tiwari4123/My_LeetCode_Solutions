class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] prefGcd=new int[n];
        int max=nums[0];
        prefGcd[0]=max;
        for(int i=1;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            prefGcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefGcd);
        int i=0;
        int j=n-1;
        long sum=0;
        while(i<j){
            sum+=gcd(prefGcd[i],prefGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
    public int gcd(int a,int b){
        while(a!=0){
            int temp=b%a;
            b=a;
            a=temp;
        }
        return b;
    }
}