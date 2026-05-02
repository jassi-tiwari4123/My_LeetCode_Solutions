class Solution {
    public boolean isValid(String word) {
        char[] ch=word.toCharArray();
        int n=word.length();
        if(n<3) return false;
        boolean vowel=false;
        boolean cons=false;
        for(int i=0;i<n;i++){
            char c=ch[i];
            if(!Character.isLetterOrDigit(c)) return false;
            if(Character.isLetter(c)){
                char x=Character.toLowerCase(c);
                if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u') vowel=true;
                else cons=true;
            }
        }
        return vowel && cons;
    }
}