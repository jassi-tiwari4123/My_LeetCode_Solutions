class Solution {
    public int countDigitOne(int n) {
        String s=String.valueOf(n);
        int len=s.length();
        int[][][] dp=new int[11][2][11];
        for(int i=0;i<11;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return fxn(0,1,0,s,dp);
    }
    public int fxn(int idx,int restrict,int count,String s,int[][][]dp){
        if(idx==s.length()) return count;
        if(dp[idx][restrict][count]!=-1) return dp[idx][restrict][count];
        int limit=(restrict==1)?s.charAt(idx)-'0':9;
        int ans=0;
        for(int i=0;i<=limit;i++){
            ans+=fxn(idx+1,(restrict==1 && i==limit)?1:0,count+(i==1?1:0),s,dp);
        }
        return dp[idx][restrict][count]=ans;
    }
}

// class Solution {
//     public int countDigitOne(int n) {
//         String s=String.valueOf(n);
//         int len=s.length();
//         int[][][] dp=new int[11][2][11];
//         for(int i=0;i<11;i++){
//             for(int j=0;j<2;j++){
//                 Arrays.fill(dp[i][j],-1);
//             }
//         }
//         return fxn(0,1,0,s,dp);
//     }
//     public int fxn(int idx,int restrict,int count,String s,int[][][]dp){
//         if(idx==s.length()) return count;
//         if(dp[idx][restrict][count]!=-1) return dp[idx][restrict][count];
//         int limit=(restrict==1)?s.charAt(idx)-'0':9;
//         int ans=0;
//         for(int i=0;i<=9;i++){
//             ans+=fxn(idx+1,(restrict==1 && i==limit)?1:0,count+(i==1?1:0),s,dp);
//         }
//         return dp[idx][restrict][count]=ans;
//     }
// }



