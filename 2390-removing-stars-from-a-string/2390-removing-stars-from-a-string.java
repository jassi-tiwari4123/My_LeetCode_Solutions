class Solution {
    public String removeStars(String s) {
        //APPROACH - 1
        // int n=s.length();
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<n;i++){
        //     if(s.charAt(i)!='*'){
        //         st.push(s.charAt(i));
        //     }
        //     else{
        //         if(!st.isEmpty()){
        //             st.pop();
        //         }
        //     }
        // }
        // StringBuilder sb=new StringBuilder();
        // while(!st.isEmpty()){
        //     sb.append(st.pop());
        // }
        // return sb.reverse().toString();

        //WITHOUT STACK 
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}