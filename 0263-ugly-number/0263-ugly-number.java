class Solution {
    public boolean isUgly(int n) {
        while(n>1){
            if(n%2==0) n/=2;
            else if(n%3==0) n/=3;
            else if(n%5==0) n/=5;
            else return false;
        }
        return (n==1);
        
        // if(n<=0) return false;
        // int[] arr={2,3,5};
        // for(int i=0;i<arr.length;i++){
        //     while(n%arr[i]==0){
        //         n/=arr[i];
        //     }
        // }
        // return n==1;


        
    }
}