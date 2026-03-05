class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int l=0;
        int maxLen=Integer.MIN_VALUE;
        int[] hash=new int[26];
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']++;
            while(hash[s.charAt(i)-'a']>2){
                hash[s.charAt(l)-'a']--;
                l++;
            }
            maxLen=Math.max(i-l+1,maxLen);
        }
        return maxLen;
    }
}