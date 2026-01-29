class Solution {
    public int numSub(String s) {
        long one=0;
        long count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }
            else{
                count=(count+one*(one+1)/2)%1000000007;
                one=0;
            }
        }
        count=(count+one*(one+1)/2)%1000000007;
        return (int) count;
    }
}