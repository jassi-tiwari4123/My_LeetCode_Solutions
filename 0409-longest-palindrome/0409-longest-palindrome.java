class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int res=0;
        boolean odd=false;
        for(Map.Entry<Character,Integer> m:hm.entrySet()){
            char ch=m.getKey();
            int freq=m.getValue();
            if(freq%2==0){
                res+=freq;
            }
            else{
                res+=freq-1;
                odd=true;
            }
        }
        if(odd) res+=1;
        return res;
    }
}