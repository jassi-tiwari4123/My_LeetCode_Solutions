class Solution {
    public int maxDepth(String s) {
        int dep=0;
        int max=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                dep++;
                max=Math.max(max,dep);
            } 
            else if(ch==')'){
                dep--;
            }
        }
        return max;
    }
}