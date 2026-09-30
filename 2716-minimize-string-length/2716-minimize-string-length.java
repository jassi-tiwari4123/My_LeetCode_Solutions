class Solution {
    public int minimizedStringLength(String s) {
        int n=s.length();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(s.charAt(i));
        }
        return hs.size();
        // HashMap<Character,Integer> hm=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     char ch=s.charAt(i);
        //     hm.put(ch,hm.getOrDefault(ch,0)+1);
        // }
        // return hm.size();
    }
}