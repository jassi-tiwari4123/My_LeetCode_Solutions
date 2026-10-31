class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int maxFreq=0;
        int maxLen=0;
        int[] hm=new int[26];
        for(int i=0;i<n;i++){
            hm[s.charAt(i)-'A']++;
            maxFreq=Math.max(maxFreq,hm[s.charAt(i)-'A']);
            int len=i-left+1;
            if(len-maxFreq<=k){
                maxLen=Math.max(maxLen,len);
            }
            else{
                hm[s.charAt(left)-'A']--;
                left++;
            }
        }
        return maxLen;
    }
}