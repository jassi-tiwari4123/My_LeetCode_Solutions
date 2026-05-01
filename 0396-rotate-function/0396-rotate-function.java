// class Solution {
//     public int maxRotateFunction(int[] nums) {
//         //giving TLE from this approach (45/58) test case passed: O(n^2)
//         int n=nums.length;
//         int ans=0;
//         ans=compute(nums);
//         for(int i=1;i<n;i++){
//             int[] res=nums.clone();
//             rotate(res,i);
//             int op=compute(res);
//             ans=Math.max(ans,op);

//         }
//         return ans;
//     }

//     public int compute(int[] nums){
//         int n=nums.length;
//         int ans=0;
//         for(int i=0;i<n;i++){
//             ans+=nums[i]*i;
//         }
//         return ans;
//     }

//     public void rotate(int[] res,int k){
//         int n=res.length;
//         k=k%n;
//         reverse(res,0,n-1);
//         reverse(res,0,k-1);
//         reverse(res,k,n-1);
//     }

//     public void reverse(int[] res,int i,int j){
//         while(i<j){
//             int temp=res[i];
//             res[i]=res[j];
//             res[j]=temp;
//             i++;
//             j--;
//         }
//     }

// }


//optimised
//formula we will use:
//f(0)=normal calc gives 25
//4*0+3*1+2*2+6*3
//f(1)=4*1+3*2+2*3+6*0 observing the pattern from prev f(0) incrementing each value once so overall sum=15 but excluding 6 as 6 is now at 0 15-6=9
// also excluding 6*3 from 25 25-18=7
//mow result=9+7=16
// formula is: f(i)=f(i-1)-(n-i)*arr[n-i]+(sum-arr[n-i)==>f(i-1)-(sum-)
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int F0=0;
        for(int i=0;i<n;i++){
            F0+=nums[i]*i;
        }
        int res=F0;
        int f0=F0;
        for(int i=1;i<n;i++){
            int formula=f0+total-n*nums[n-i];
            res=Math.max(res,formula);
            f0=formula;
        }
        return res;
    }
}