class Solution {
    public String sortVowels(String s) {
        char[] arr=s.toCharArray();
        ArrayList<Character> vowel=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(arr[i])){
                vowel.add(arr[i]);
            }
        }
        Collections.sort(vowel);
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i]=vowel.get(ind++);
            }
        } 
        return new String(arr);
    }
    public boolean isVowel(char s){
        if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u' || s=='A'|| s=='E' || s=='I' || s=='O' || s=='U') {
            return true;
        }
        return false;
    }
}