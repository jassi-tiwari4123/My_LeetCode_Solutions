class Solution {
    public int rearrangeCharacters(String s, String target) {
        // for this question we can count the freq of characters in target
        // and s characters
        // answer would be s/t characters' minimum
        //example: target:c->1,o->1,d->1,e->
        // s:c->2,o->4,d->2,e->4
        // s/t--> for c:2/1->2, o:4/1->4 , d:2/1 , e:4/1->4
        //min(2,4,2,4)->2

        int[] tFreq=new int[26];
        int[] sFreq=new int[26];
        int nt=target.length();
        int ns=s.length();
        for(int i=0;i<nt;i++){
            tFreq[target.charAt(i)-'a']++;
        }
        for(int i=0;i<ns;i++){
            sFreq[s.charAt(i)-'a']++;
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(tFreq[i]>0){
                res=Math.min(res,sFreq[i]/tFreq[i]);
            }
        }
        return res;
    }
}