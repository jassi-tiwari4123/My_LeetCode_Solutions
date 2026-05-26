class Solution {
    public int numberOfSpecialChars(String word) {
        // HashSet<Character> l=new HashSet<>();
        // HashSet<Character> h=new HashSet<>();
        // int n=word.length();
        // for(char ch:word.toCharArray()){
        //     if(Character.isLowerCase(ch)){
        //         l.add(ch);
        //     }
        //     else{
        //         h.add(ch);
        //     }
        // }
        // int res=0;
        // for(char ch:l){
        //     if(h.contains(Character.toUpperCase(ch))){
        //         res++;
        //     }
        // }
        // return res;


        //optimised array
        boolean[] low=new boolean[26];
        boolean[] up=new boolean[26];
        int res=0;
        for(char ch:word.toCharArray()){
            if(ch>='a' && ch<='z'){
                low[ch-'a']=true;
            }
            else{
                up[ch-'A']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(low[i] && up[i]){
                res++;
            }
        }
        return res;
    }
}