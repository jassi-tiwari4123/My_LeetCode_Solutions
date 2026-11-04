class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int left=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                left=Math.max(left,hm.get(ch)+1);
            }
            hm.put(ch,i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}