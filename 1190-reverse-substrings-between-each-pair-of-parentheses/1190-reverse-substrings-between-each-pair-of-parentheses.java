class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        Stack<Integer> stk=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stk.push(sb.length());
            }
            else if(ch==')'){
                int begin=stk.pop();
                String sub=sb.substring(begin);
                String rev=new StringBuilder(sub).reverse().toString();
                sb.delete(begin,sb.length());
                sb.append(rev);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}