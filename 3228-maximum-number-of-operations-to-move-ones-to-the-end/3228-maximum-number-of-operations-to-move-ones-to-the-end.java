class Solution {
    public int maxOperations(String s) {
        int n=s.length();
        int count1=0;
        int i=0;
        int res=0;
        while(i<n){
            if(s.charAt(i)=='1'){
                count1++;
                i++;
            }
            else{
                res+=count1;
                while(i<n && s.charAt(i)=='0'){
                    i++;
                }
            }
        }
        return res;
    }
}