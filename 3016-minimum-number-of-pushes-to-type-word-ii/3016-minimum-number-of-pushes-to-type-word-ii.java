class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int[] freq=new int[26];
        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int res=0;
        int ind=0;
        for(int i=25;i>=0;i--){
            int push=(ind/8)+1;
            res+=freq[i]*push;
            ind++;
        }
        return res;
    }
}