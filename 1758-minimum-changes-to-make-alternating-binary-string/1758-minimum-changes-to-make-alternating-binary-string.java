class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c!=(i%2==0?'0':'1')){
                c1++;
            }
            if(c!=(i%2==0?'1':'0')){
                c2++;
            }
        }
        return Math.min(c1,c2);
    }
}