class Solution {
    public char findTheDifference(String s, String t) {
        // int[] freq=new int[26];
        // int nt=t.length();
        // for(int i=0;i<nt;i++){
        //     freq[t.charAt(i)-'a']++;
        // }
        // for(int i=0;i<s.length();i++){
        //     freq[s.charAt(i)-'a']--;
        // }
        // char ch=' ';
        // for(int i=0;i<26;i++){
        //     if(freq[i]!=0) ch=(char)(i+'a');
        // }
        // return ch;



        int xor=0;
        for(int i=0;i<s.length();i++){
            xor^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            xor^=t.charAt(i);
        }
        return (char) xor;
    }
}