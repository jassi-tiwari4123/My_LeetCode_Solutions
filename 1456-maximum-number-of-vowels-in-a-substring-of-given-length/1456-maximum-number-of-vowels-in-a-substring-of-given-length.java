class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int left=0;
        int res=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                cnt++;
            }
            if(i-left+1==k){
                res=Math.max(res,cnt);
                if(isVowel(s.charAt(left))){
                    cnt--;
                }
                left++;
            }
        }
        return res;
    }
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}