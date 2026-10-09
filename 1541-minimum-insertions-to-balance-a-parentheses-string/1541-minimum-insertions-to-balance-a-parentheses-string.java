class Solution {
    public int minInsertions(String s) {
        int ans=0;
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    if((i+1)<n && s.charAt(i+1)==')'){
                        ans+=1;
                        i++;
                    }
                    else{
                        ans+=2;
                    }
                }
                else{
                    if((i+1)<n && s.charAt(i+1)==')'){
                        st.pop();
                        i++;
                    }
                    else{
                        ans+=1;
                        st.pop();
                    }
                }
            }
        }
        if(!st.isEmpty()) ans+=st.size()*2;
        return ans;
    }
}