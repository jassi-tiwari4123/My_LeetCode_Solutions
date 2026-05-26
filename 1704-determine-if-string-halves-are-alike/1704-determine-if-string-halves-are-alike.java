class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int i=0;
        int j=n/2;
        int countLeft=0;
        int countRight=0;
        while(i<j && (i<n/2 && j<n)){
            if(isVowel(s.charAt(i))){
                countLeft++;
            }
            if(isVowel(s.charAt(j))){
                countRight++;
            }
            i++;
            j++;
        }
        return countLeft==countRight;
    }
    public boolean isVowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
}