class Solution {
    public int countDigitOne(int n) {
        String s=String.valueOf(n);
        int len=s.length();
        int[][][] dp=new int[11][2][11];
        for(int i=0;i<11;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<11;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return fxn(0,1,0,s,dp);
    }
    public int fxn(int ind,int restrict,int count,String s,int[][][]dp){
        if(ind==s.length()) return count;
        if(dp[ind][restrict][count]!=-1) return dp[ind][restrict][count];
        int upperBound=(restrict==1)?s.charAt(ind)-'0':9;
        int res=0;
        for(int dig=0;dig<=upperBound;dig++){
            res+=fxn(ind+1,(restrict==1 && dig==upperBound)?1:0,count+(dig==1?1:0),s,dp);
        }
        return dp[ind][restrict][count]=res;
    }
}



// class Solution {
//     int[][][] dp;

//     public int countDigitOne(int n) {
//         String s = String.valueOf(n);
//         dp = new int[s.length()][2][s.length() + 1];

//         for (int i = 0; i < s.length(); i++)
//             for (int j = 0; j < 2; j++)
//                 for (int k = 0; k <= s.length(); k++)
//                     dp[i][j][k] = -1;

//         return dfs(0, 1, 0, s);
//     }

//     private int dfs(int idx, int tight, int count, String s) {
//         if (idx == s.length()) return count;

//         if (dp[idx][tight][count] != -1)
//             return dp[idx][tight][count];

//         int limit = (tight == 1) ? s.charAt(idx) - '0' : 9;
//         int res = 0;

//         for (int d = 0; d <= limit; d++) {
//             res += dfs(
//                 idx + 1,
//                 (tight == 1 && d == limit) ? 1 : 0,
//                 count + (d == 1 ? 1 : 0),
//                 s
//             );
//         }

//         return dp[idx][tight][count] = res;
//     }
// }
