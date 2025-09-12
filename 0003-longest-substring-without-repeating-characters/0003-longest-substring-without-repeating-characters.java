class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int left=0;
        int maxL=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(st.contains(c)){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(c);
            maxL=Math.max(maxL,i-left+1);
        }
        return maxL;
    }
}