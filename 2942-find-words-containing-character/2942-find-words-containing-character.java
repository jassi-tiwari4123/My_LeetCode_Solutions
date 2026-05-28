class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=words[i];
            char[] ch=s.toCharArray();
            for(int j=0;j<ch.length;j++){
                if(x==ch[j]){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}