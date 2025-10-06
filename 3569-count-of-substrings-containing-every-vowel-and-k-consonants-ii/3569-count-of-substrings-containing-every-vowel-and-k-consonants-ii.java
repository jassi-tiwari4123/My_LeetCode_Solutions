class Solution {
    public long countOfSubstrings(String word, int k) {
        int n=word.length();
        int[] nextConsonant=new int[n];
        int next=n;
        for(int i=n-1;i>=0;i--){
            nextConsonant[i]=next;
            if(!isVowel(word.charAt(i))){
                next=i;
            }
        }
        int left=0;
        int right=0;
        long ans=0;
        int consonant=0;
        Map<Character,Integer> hm=new HashMap<>();
        while(right<n){
            char c=word.charAt(right);
            if(isVowel(c)){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
            else{
                consonant++;
            }
            while(left<n && consonant>k){
                char x=word.charAt(left);
                if(isVowel(x)){
                    hm.put(x,hm.get(x)-1);
                    if(hm.get(x)==0){
                        hm.remove(x);
                    }
                }
                else{
                    consonant--;
                }
                left++;
            }
            while(left<n && hm.size()==5 && consonant==k){
                ans+=nextConsonant[right]-right;
                char z=word.charAt(left);
                if(isVowel(z)){
                    hm.put(z,hm.get(z)-1);
                    if(hm.get(z)==0){
                        hm.remove(z);
                    }
                }
                else{
                    consonant--;
                }
                left++;
            }
            right++;
        }
        return ans;
    }
    public static boolean isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
    
}