class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        int balance=0;
        int score=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') balance+=1;
            else{
                balance-=1;
                if(s.charAt(i-1)=='('){
                    score+=(int)(Math.pow(2,balance));
                }
            }
        }
        return score;
    }
}