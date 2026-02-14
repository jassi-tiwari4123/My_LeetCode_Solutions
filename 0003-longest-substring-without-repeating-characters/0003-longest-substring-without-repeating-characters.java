class Solution {
    public int lengthOfLongestSubstring(String s) {

        //brute
        int n=s.length();
        int len=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            int[] hash=new int[255];
            for(int j=i;j<n;j++){
                if(hash[s.charAt(j)]==1) break;
                hash[s.charAt(j)]++;
                len=j-i+1;
                maxLen=Math.max(maxLen,len);
            }
        }
        return maxLen;


        //using set
        // Set<Character> st=new HashSet<>();
        // int left=0;
        // int maxL=0;
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     while(st.contains(c)){
        //         st.remove(s.charAt(left));
        //         left++;
        //     }
        //     st.add(c);
        //     maxL=Math.max(maxL,i-left+1);
        // }
        // return maxL;
    }
}