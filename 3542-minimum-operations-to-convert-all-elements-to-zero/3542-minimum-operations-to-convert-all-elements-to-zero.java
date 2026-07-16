class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int op=0;
        for(int x:nums){
            while(!st.isEmpty() && st.peek()>x){    
                st.pop();
            }
            if(x!=0 && (st.isEmpty() || st.peek()<x)){
                st.push(x);
                op++;
            }
        }
        return op;
    }
}