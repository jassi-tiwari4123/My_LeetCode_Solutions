class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        Boolean[][] dp = new Boolean[n + 1][m + 1];
        return fxn(s, t, n, m, dp);
    }

    private boolean fxn(String s, String t, int n, int m, Boolean[][] dp) {
        if (n == 0) return true;    
        if (m == 0) return false;    

        if (dp[n][m] != null) {
            return dp[n][m];
        }

        if (s.charAt(n - 1) == t.charAt(m - 1)) {
            dp[n][m] = fxn(s, t, n - 1, m - 1, dp);
        } else {
            dp[n][m] = fxn(s, t, n, m - 1, dp);
        }

        return dp[n][m];
    }
}
