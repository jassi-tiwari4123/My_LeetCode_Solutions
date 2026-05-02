class Solution {
    public boolean isAnagram(String s, String t) {
        // int n=s.length();
        // int m=t.length();
        // if(n!=m) return false;
        // HashMap<Character,Integer> hm=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0;i<m;i++){
        //     if(!hm.containsKey(t.charAt(i))) return false;
        //     hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
        //     if(hm.get(t.charAt(i))==0){
        //         hm.remove(t.charAt(i));
        //     }
        // }
        // return hm.size()==0;

        //basic
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int n=c1.length;
        int m=c2.length;
        if(n!=m) return false;
        for(int i=0;i<n;i++){
            if(c1[i]!=c2[i]) return false;
        }
        return true;
    }
}