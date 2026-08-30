class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int res=Integer.MAX_VALUE;
        int left=0;
        int cnt=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=blocks.charAt(i);
            if(ch=='W') cnt++;
            if(i-left+1==k){
                res=Math.min(res,cnt);
                if(blocks.charAt(left)=='W') {
                    cnt--;
                }
                left++;
            }
        }
        return res;
    }
}