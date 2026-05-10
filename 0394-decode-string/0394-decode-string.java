class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1=new Stack<>();
        Stack<String> st2=new Stack<>();
        int count=0;
        String cur="";
        char[] arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++){
            char ch=arr[i];
            if(Character.isDigit(ch)){
                count=count*10+(ch-'0');
            }
            else if(ch=='['){
                st1.push(count);
                count=0;
                st2.push(cur);
                cur="";
            }
            else if(ch==']'){//computaion
                StringBuilder sb=new StringBuilder(st2.pop());
                int num=st1.pop();
                for(int j=1;j<=num;j++){
                    sb.append(cur);
                }
                cur=sb.toString();
            }
            else{
                cur+=ch;
            }
        }
        return cur;
    }
}