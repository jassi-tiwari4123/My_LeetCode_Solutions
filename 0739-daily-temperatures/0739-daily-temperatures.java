class Solution {
    public int[] dailyTemperatures(int[] temp) {
        //brute force but it will give tle
        // int n=temp.length;
        // int[] res=new int[n];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(temp[i]<temp[j]){
        //             res[i]=j-i;
        //             break;
        //         }
        //     }
        // }
        // return res;

        //optimised - use stack(next greater element)
        int n=temp.length;
        Stack<Integer> st=new Stack<>();
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temp[i]>=temp[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]=st.peek()-i;
            }
            st.push(i);
        } 
        return res;
    }
}