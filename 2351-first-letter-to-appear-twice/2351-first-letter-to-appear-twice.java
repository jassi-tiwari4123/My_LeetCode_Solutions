class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            int val=hm.get(ch);
            if(val==2) return ch; 
        }
        return ' ';
    }
}