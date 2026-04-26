class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Character> ls=new ArrayList<>(hm.keySet());
        Collections.sort(ls,(a,b)->hm.get(b)-hm.get(a));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ls.size();i++){
            int fr=hm.get(ls.get(i));;
            while(fr-->0){
                sb.append(ls.get(i));
            }
        }
        return sb.toString();
    }
}