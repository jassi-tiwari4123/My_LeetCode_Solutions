class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // List<Integer> res=new ArrayList<>();
        // int np=p.length();
        // int ns=s.length();
        // if(ns<np) return res;
        // HashMap<Character,Integer> hm=new HashMap<>();
        // for(int i=0;i<np;i++){
        //     char ch=p.charAt(i);
        //     hm.put(ch,hm.getOrDefault(ch,0)+1);
        // }
        // //for first window
        // for(int i=0;i<np;i++){
        //     char ch=s.charAt(i);
        //     hm.put(ch,hm.getOrDefault(ch,0)-1);
        //     if(hm.get(ch)==0) hm.remove(ch);
        // }
        // if(hm.size()==0) res.add(0);
        // //next windows
        // int left=0;
        // for(int i=np;i<ns;i++){
        //     char ch=s.charAt(left);
        //     hm.put(ch,hm.getOrDefault(ch,0)+1);
        //     if(hm.get(ch)==0){
        //         hm.remove(ch);
        //     }
        //     left++;
        //     char add=s.charAt(i);
        //     hm.put(add,hm.getOrDefault(add,0)-1);
        //     if(hm.get(add)==0) hm.remove(add);
        //     if(hm.size()==0) res.add(left);
        // }
        // return res;



        //using hash array
        List<Integer> res=new ArrayList<>();
        int np=p.length();
        int ns=s.length();
        if(ns<np) return res;
        int[] hash=new int[26];
        for(int i=0;i<np;i++){
            char ch=p.charAt(i);
            hash[ch-'a']++;
        }
        int i=0;
        int j=0;
        while(j<ns){
            char ch=s.charAt(j);
            hash[ch-'a']--;
            if((j-i+1)==np){
                if(allZero(hash)){
                    res.add(i);
                }
                hash[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return res;
    }
    public boolean allZero(int[] hash){
        for(int i=0;i<26;i++){
            if(hash[i]!=0) return false;
        }
        return true;
    }
}