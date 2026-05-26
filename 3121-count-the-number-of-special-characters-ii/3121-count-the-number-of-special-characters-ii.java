class Solution {
    public int numberOfSpecialChars(String word) {
        //last occurence of lowee and first occ of upper
        int[] low=new int[26];
        int[] up=new int[26];
        int res=0;
        Arrays.fill(low,-1);
        Arrays.fill(up,-1);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                low[ch-'a']=i;
            }
            else{
                int ind=ch-'A';
                if(up[ind]==-1){  //for first occ of uppercase
                    up[ind]=i;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(low[i]!=-1 && up[i]!=-1 && low[i]<up[i]){
                res++;
            }
        }
        return res;
    }
}