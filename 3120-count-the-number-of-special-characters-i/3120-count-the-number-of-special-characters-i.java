class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> l=new HashSet<>();
        HashSet<Character> h=new HashSet<>();
        int n=word.length();
        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)){
                l.add(ch);
            }
            else{
                h.add(ch);
            }
        }
        int res=0;
        for(char ch:l){
            if(h.contains(Character.toUpperCase(ch))){
                res++;
            }
        }
        return res;
    }
}