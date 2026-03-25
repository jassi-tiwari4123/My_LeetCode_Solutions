class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        //using normal permutaion
        // if(n==0) return 1;
        // //agar n==1 mean 0 to 10 : 10 excluded
        // int num=10;
        // int unitPlace=9; //0 nhi daal sakte in the beginning 
        // int remaining=9; // ek use ho gya vo ab vaapis use nhi kar sakte toh we still have 9 options (0-9 excluding the one used in front of the number)
        // //seconf place ke liye choice then so on
        // for(int i=2;i<=n && remaining>0;i++){
        //     unitPlace=unitPlace*remaining;  
        //     num+=unitPlace;
        //     remaining--;
        // }
        // return num;
    


    // complexity is O(log n) as we are iterating over no of digits of n eg n=2 mean till 10^2 =100 not included so till log 10(n);
    //digit dp question bit masking use(unknown by the concept yet)
    //abhi hi padh liya....hmmmmm.....
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append('9');
        }
        String s=sb.toString();
        int len=s.length();
        int[][][][] dp=new int[10][2][1<<10][2];
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<(1<<10);k++){
                    Arrays.fill(dp[i][j][k],-1);
                }
            }
        }
        return fxn(0,1,0,0,s,dp);
    }
    public static int fxn(int idx,int restrict,int mask,int trailingZero,String s,int[][][][]dp){
        if(idx==s.length()) return 1;
        if(dp[idx][restrict][mask][trailingZero]!=-1) return dp[idx][restrict][mask][trailingZero];
        int upper=(restrict==1)?s.charAt(idx)-'0':9;
        int res=0;
        for(int i=0;i<=upper;i++){
            if(trailingZero==0 && i==0){  //iska matlb abhi trailing zero nhi hai number start nhi hua hai and mask ki need nhi kyunki aage trailing zero can be possible as for making 1 and 2 digits
                res+=fxn(idx+1,(restrict==1 && i==upper)?1:0,mask,0,s,dp);
            }
            else{
                if((mask & (1<<i))!=0) continue;
                res+=fxn(idx+1,(restrict==1 && i==upper)?1:0,mask | (1<<i),1,s,dp);
            }
        }
        return  dp[idx][restrict][mask][trailingZero]=res;
    }
}