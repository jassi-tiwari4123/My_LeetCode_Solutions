class Solution {
    public int sumSubarrayMins(int[] arr) {
        //TLE AND BRUTE
        // int n = arr.length;
        // int ans = 0;
        // for (int i = 0; i < n; i++) {
        //     int mini = arr[i];
        //     for (int j = i; j < n; j++) {
        //         mini = Math.min(mini, arr[j]);
        //         ans = (ans+mini)%1000000007;
        //     }
        // }
        // return ans;

        //optimised
        //identitfy nse and pse for each element then multiply to get the contribution of them for minimum sum
        long res=0;
        int[] prevSmaller=prevSmaller(arr);
        int[] nextSmaller=nextSmaller(arr);
        for(int i=0;i<arr.length;i++){
            int left=i-prevSmaller[i];
            int right=nextSmaller[i]-i;
            long contribute=(long)left*right*arr[i];
            res=(res+contribute)%1000000007;
        }
        return (int) res;
    }
    public int[] prevSmaller(int[] arr){
        int[] psee=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()) psee[i]=-1;
            else{
                psee[i]=st.peek();
            }
            st.push(i);
        }
        return psee;
    }
    public int[] nextSmaller(int[] arr){
        int[] nse=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) nse[i]=arr.length;
            else{
                nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }
}