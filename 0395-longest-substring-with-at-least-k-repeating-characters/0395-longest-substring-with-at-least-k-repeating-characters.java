class Solution {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        return fxn(s,k,0,n-1);
    }
    public int fxn(String s,int k,int left,int right){
        if(right-left+1<k) return 0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=left;i<=right;i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        //finding char having freq<k
        for(int i=left;i<=right;i++){
            char ch=s.charAt(i);
            if(hm.get(ch)<k){ //split
                int leftpart=fxn(s,k,left,i-1);
                int rightpart=fxn(s,k,i+1,right);
                return Math.max(leftpart,rightpart);
            }
        }
        return right-left+1;

    }
}