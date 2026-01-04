class Solution {
    public int sumFourDivisors(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int count=0;
            int divSum=0;
            int num=nums[i];
            for(int j=1;j*j<=num;j++){
                if(num%j==0){
                    if(j*j==num){
                        count++;
                        divSum+=j;
                    }
                    else{
                        count+=2;
                        divSum+=j+num/j;
                    } 
                }
            }
            if(count==4)  sum+=divSum;
        }
        return sum;
    }
}