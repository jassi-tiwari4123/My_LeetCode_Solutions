class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int res=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.size()==3){
                res+=(n-j);
                char left=s.charAt(i);
                hm.put(left,hm.get(left)-1);
                if(hm.get(left)==0){
                    hm.remove(left);
                }
                i++;
            }
            j++;
        }
        return res;
    }
}