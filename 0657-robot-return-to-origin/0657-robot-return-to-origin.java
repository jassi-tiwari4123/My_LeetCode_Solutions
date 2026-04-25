class Solution {
    public boolean judgeCircle(String moves) {
        int u=0;
        int l=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='U') u++;
            if(moves.charAt(i)=='D') u--;
            if(moves.charAt(i)=='L') l++;
            if(moves.charAt(i)=='R') l--;
        }
        return (u==0 && l==0);
    }
}