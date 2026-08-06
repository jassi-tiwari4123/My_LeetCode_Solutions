class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int[] res=new int[n+1];
        int startI=0;
        int startD=n;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='I'){
                res[i]=startI;
                startI++;
            }
            else{
                res[i]=startD;
                startD--;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=res[i];
        }
        int leftElement=(n*(n+1)/2)-sum;
        res[n]=leftElement;
        return res;
    }
}