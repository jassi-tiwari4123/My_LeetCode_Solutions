class Solution {
    public int calculate(String s) {
       int n=s.length();
        int res=0;
        int curno=0;
        char sign='+';
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                curno=c-'0';
                while((i+1)<n && Character.isDigit(s.charAt(i+1))){
                    curno=curno*10+s.charAt(i+1)-'0';
                    i++;
                }
            }
            if((!Character.isDigit(c) && c!=' ' )|| i==n-1){
                if(sign=='+'){
                    st.push(curno);
                }
                else if(sign=='-'){
                    st.push(-curno);
                }
                else if(sign=='*'){
                    st.push(st.pop()*curno);
                }
                else if(sign=='/'){
                    if(curno==0){
                        st.push(0);
                    }
                    else{
                    st.push(st.pop()/curno);}
                }
                sign=c;
                curno=0;
            }
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}