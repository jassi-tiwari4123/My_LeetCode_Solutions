class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        int n=num.length();
        int ind=0;
        for(int i=0;i<n;i++){
            int x=num.charAt(i)-'0';
            while(!st.isEmpty() && st.peek()>x && k>0){
                st.pop();
                k--;
            }
            st.push(x);
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while (sb.length()>1 && sb.charAt(0)=='0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}