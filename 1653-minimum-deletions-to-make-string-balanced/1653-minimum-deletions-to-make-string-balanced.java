class Solution {
    public int minimumDeletions(String s) {
        int bCount=0;
        int op=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                bCount++;
            }
            else{
                op=Math.min(op+1,bCount);
            }
        }
        return op;
    }
}