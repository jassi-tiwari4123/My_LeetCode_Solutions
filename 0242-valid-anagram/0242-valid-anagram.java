class Solution {
    public boolean isAnagram(String s, String t) {
        //optimal
        HashMap<Character,Integer> hm=new HashMap<>();
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2) return false;
        for(int i=0;i<n1;i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n1;i++){
            char ch=t.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0){
                    hm.remove(ch);
                }
            }
        }
        return hm.size()==0;

        // //basic
        // char[] s1=s.toCharArray();
        // char[] s2=t.toCharArray();
        // Arrays.sort(s1);
        // Arrays.sort(s2);
        // int n1=s1.length;
        // int n2=s2.length;
        // if(n1!=n2) return false;
        // for(int i=0;i<n1;i++){
        //     if(s1[i]!=s2[i]) return false;
        // }
        // return true;
    }
}