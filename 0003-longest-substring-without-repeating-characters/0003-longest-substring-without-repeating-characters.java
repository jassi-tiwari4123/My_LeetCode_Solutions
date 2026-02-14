class Solution {
    public int lengthOfLongestSubstring(String s) {

        //brute
        // int n=s.length();
        // int len=0;
        // int maxLen=0;
        // for(int i=0;i<n;i++){
        //     int[] hash=new int[255];
        //     for(int j=i;j<n;j++){
        //         if(hash[s.charAt(j)]==1) break;
        //         hash[s.charAt(j)]++;
        //         len=j-i+1;
        //         maxLen=Math.max(maxLen,len);
        //     }
        // }
        // return maxLen;


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


        //using hash again
        int n=s.length();
        int left=0;
        int right=0;
        int maxLen=0;
        int len=0;
        int[] Hash=new int[255];
        Arrays.fill(Hash,-1);
        while(right<n){
            if(Hash[s.charAt(right)]!=-1){
                if(Hash[s.charAt(right)]>=left){
                    left=Hash[s.charAt(right)]+1;
                }
            }
            len=right-left+1;
            maxLen=Math.max(maxLen,len);
            Hash[s.charAt(right)]=right;
            right++;
        }
        return maxLen;
    }
}