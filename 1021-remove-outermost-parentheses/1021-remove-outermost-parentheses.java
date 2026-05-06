class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                if(!st.isEmpty()){
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}

