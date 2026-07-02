class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int n=words.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int ans=1;
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(isPred(words[prev],words[i])){
                    dp[i]=Math.max(dp[i],1+dp[prev]);
                }
                ans=Math.max(ans,dp[i]);
            }
        }
        return ans;
    }
    public boolean isPred(String s,String t){
        if(t.length()!=s.length()+1) return false;
        int i=0;
        int j=0;
        while(j<t.length()){
            if(i<s.length() && s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}