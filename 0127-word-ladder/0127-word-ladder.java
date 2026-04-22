class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hs=new HashSet<>(wordList);
        if(!hs.contains(endWord)) return 0;
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        int res=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String cur=q.poll();
                if(cur.equals(endWord)) return res;
                char[] ch=cur.toCharArray();
                for(int j=0;j<ch.length;j++){
                    char c=ch[j];
                    for(char x='a';x<='z';x++){
                        if(x==c) continue;
                        ch[j]=x;
                        String st=new String(ch);
                        if(hs.contains(st)){
                            q.add(st);
                            hs.remove(st);
                        }
                    }
                    ch[j]=c;
                }
            }
            res++;
        }
        return 0;

    }
}