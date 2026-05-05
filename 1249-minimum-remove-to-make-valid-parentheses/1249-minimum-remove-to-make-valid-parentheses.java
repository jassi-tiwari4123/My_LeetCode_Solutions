class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder(s);
        Stack<Integer> st=new Stack<>();
        int n=sb.length();
        for(int i=0;i<n;i++){
            if(sb.charAt(i)=='('){
                st.push(i);
            }
            if(sb.charAt(i)==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    sb.setCharAt(i,'%'); //kyunki hum delete karenge toh index par bhi asar padega to to avoid that we didnt delete we set the char as invalid
                }
            }
        }
        while(!st.isEmpty()){
            sb.setCharAt(st.pop(),'%');
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='%'){
                res.append(sb.charAt(i));
            }
        }
        return res.toString();
    }
}