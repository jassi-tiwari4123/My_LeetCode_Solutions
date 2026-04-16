class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        for(int i=0;i<2*n;i++){
            int el=nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<el){
                res[st.pop()]=el;
            }
            if(i<n){
                st.push(i);
            }
        }
        return res;
    }
}