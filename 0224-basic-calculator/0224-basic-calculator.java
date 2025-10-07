class Solution {
    public int calculate(String s) {
        int n=s.length();
        int ans=0;
        int curno=0;
        int sign=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                curno=s.charAt(i)-'0';
                while((i+1)<n && Character.isDigit(s.charAt(i+1))){
                    curno=curno*10+s.charAt(i+1)-'0';
                    i++;
                }
                curno=sign*curno;
                ans+=curno;
                curno=0;
            }
            else if(s.charAt(i)=='+'){
                sign=1;
            }
            else if(s.charAt(i)=='-'){
                sign=-1;
            }
            else if(s.charAt(i)=='('){
                st.push(ans);
                st.push(sign);
                sign=1;
                ans=0;
            }
            else if(s.charAt(i)==')'){
                int prevsign=st.pop();
                ans=prevsign*ans;
                int prevans=st.pop();
                ans=prevans+ans;
            }
        }  
        return ans;
    }  
}
