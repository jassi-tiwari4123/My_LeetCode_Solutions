class Solution {
    int n;
    int[] dp;
    public int minCut(String s) {
        n=s.length();
        dp=new int[n];
        Arrays.fill(dp,-1);
        return fxn(0,s)-1;
    }
    public int fxn(int i,String s){
        if(i==n) return 0;
        if(dp[i]!=-1) return dp[i];
        int min=Integer.MAX_VALUE;
        for(int j=i;j<n;j++){
            if(isPalindrome(s,i,j)){
                int cost=1+fxn(j+1,s);
                min=Math.min(min,cost);
            }
        }
        return dp[i]=min;
    }
    public boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}