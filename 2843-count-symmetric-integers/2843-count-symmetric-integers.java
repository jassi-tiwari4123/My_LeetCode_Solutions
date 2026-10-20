class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for(int i=low;i<=high;i++){
            int dig=countDig(i);
            if(dig%2!=0) continue;
            int half=(int) Math.pow(10,dig/2);
            int first=i/half;
            int sec=i%half;
            if(sum(first)==sum(sec)) cnt++;
        }
        return cnt;
    }
    public int countDig(int num){
        int cnt=0;
        while(num!=0){
            cnt++;
            num/=10;
        }
        return cnt;
    }
    public int sum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}


// class Solution {
//     public int countSymmetricIntegers(int low, int high) {
//         int cnt=0;
//         for(int i=low;i<=high;i++){
//             String num=String.valueOf(i);
//             int len=num.length();
//             if(len%2!=0) continue;
//             int val1=Integer.parseInt(num.substring(0,len/2));
//             int val2=Integer.parseInt(num.substring(len/2));
//             int sum1=0;
//             int sum2=0;
//             while(val1!=0){
//                 sum1+=val1%10;
//                 val1/=10;
//             }
//             while(val2!=0){
//                 sum2+=val2%10;
//                 val2/=10;
//             }
//             if(sum1==sum2) cnt++;
//         }
//         return cnt;
//     }
// }


